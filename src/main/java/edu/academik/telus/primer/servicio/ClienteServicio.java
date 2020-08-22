/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.academik.telus.primer.servicio;

import edu.academik.telus.primer.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 50232
 */
public class ClienteServicio {
    public List<Cliente> buscarClientes(){
        
        String html=" <tr></tr>";
        
        List<Cliente>clienteList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            Cliente cliente =new Cliente();
            
//            cliente.setId((Long)i);
            cliente.setNombre("Nombre "+i);
            cliente.setNombre("Apellido "+i);
            clienteList.add(cliente);
        }
        return clienteList;
    
    }
    
}
