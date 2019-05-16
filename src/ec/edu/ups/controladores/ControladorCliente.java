/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorCliente {
    
    //Atributos + (List)
    private Set<Cliente> lista;
    private int codigo;

    
    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
    //******C.R.U.D******\\
    
    //Create (Crear)
    public void crear(Cliente objeto){
        codigo++;
        lista.add(objeto);        
    }
    
    //Read (Leer)
    public Cliente read(int codigo){
        for (Cliente cliente : lista) {
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }        
        return null;
    }
    
    //Update (Actualizar)
    public void update(Cliente objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //Delete (Borrar)
    public void delete(int codigo){
        for (Cliente televisor : lista) {
            if(televisor.getCodigo() == codigo){
                lista.remove(televisor);
                break;
            }
        }  
    } 
    //Metodo que devuelve toda la lista
      public Set<Cliente> getLista() {
        return lista;
    }
      
  
     
}
