/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorProducto {
    
    //Atributos + (List)
    private Set<Producto> lista;
    private int codigo;

    public ControladorProducto() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
     //******C.R.U.D******\\
    
    //Create (Crear)
    public void crear(Producto objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
   
    //Read (Leer)
    public Producto read(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigo() == codigo){
                return producto;
            }
        }        
        return null;
    }
    
    //Update (Actualizar)
    public void update(Producto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //Delete (Borrar)
    public void delete(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigo() == codigo){
                lista.remove(producto);
                break;
            }
        }  
    } 

    //Metodo que devuelve toda la lista
    public Set<Producto> getLista() {
        return lista;
    
  }
    
}
