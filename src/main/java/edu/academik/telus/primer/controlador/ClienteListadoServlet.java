
package edu.academik.telus.primer.controlador;

import edu.academik.telus.primer.modelo.Cliente;
import edu.academik.telus.primer.servicio.ClienteServicio;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ClienteListadoServlet", urlPatterns = {"/cliente-listado.do"})
public class ClienteListadoServlet extends HttpServlet {
    private ClienteServicio clienteServicio =new ClienteServicio();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente>clienteList =this.clienteServicio.buscarClientes();
        System.out.println("Clientes: "+clienteList);
        request.setAttribute("clienteLsitAttr",clienteList);
        request.getRequestDispatcher("clientes/cliente-listado.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
