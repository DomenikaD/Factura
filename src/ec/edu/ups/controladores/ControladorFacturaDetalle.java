/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.FacturaDetalle;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorFacturaDetalle {
    
    //Atributos + (List) 
    private Set<FacturaDetalle> lista;
    private int codigo;

    public ControladorFacturaDetalle() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
    
     //******C.R.U.D******\\
    
    //Create (Crear)
    public void crear(FacturaDetalle objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
    }
   
     //Read (Leer)
    public FacturaDetalle read(int codigo){
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo() == codigo){
                return facturaDetalle;
            }
        }        
        return null;
    }
    
    //Update (Actualizar)
    public void update(FacturaDetalle objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //Delete (Borrar)
    public void delete(int codigo){
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo() == codigo){
                lista.remove(facturaDetalle);
                break;
            }
        }  
    }
    
    //Metodo que devuelve toda la lista
    public Set<FacturaDetalle> getLista(){
         return lista;    
    }   
    
}
