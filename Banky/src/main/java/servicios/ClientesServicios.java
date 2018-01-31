/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.ClientesDAO;
import java.util.List;
import model.Cliente;

/**
 *
 * @author oscar
 */
public class ClientesServicios {
    
    
    public List<Cliente> getAllClientes()
    {
        ClientesDAO dao = new ClientesDAO();
        
        return dao.getAllClientesJDBC();
    }
    
    public Cliente addCliente(Cliente clienteNuevo)
    {
        ClientesDAO dao = new ClientesDAO();
        
        return dao.insertClienteJDBC(clienteNuevo);
    }
    public void delCliente(Cliente clienteNuevo)
    {
        ClientesDAO dao = new ClientesDAO();
        
        dao.delUser(clienteNuevo);
    }
    public void updateCliente (Cliente clienteNuevo){
         ClientesDAO dao = new ClientesDAO();
        
        dao.updateUser(clienteNuevo);
    }
    
}
