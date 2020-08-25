
package edu.academik.telus.primer.servicio;

import edu.academik.telus.primer.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;


public class ClienteServicio {
    public List<Cliente> buscarClientes(){
        
        String html=" <tr></tr>";
        
        List<Cliente>clienteList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            Cliente cliente =new Cliente();
            
            cliente.setId((long)i);
            cliente.setNombre("Nombre "+i);
            cliente.setApellido("Apellido "+i);
            clienteList.add(cliente);
        }
        return clienteList;
    
    }
    
}
