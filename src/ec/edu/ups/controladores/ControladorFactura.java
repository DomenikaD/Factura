/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorFactura {
    
     //Atributos + (List)
    private Set<Factura> lista;
    private int codigo;

    public ControladorFactura() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
    
     //******C.R.U.D******\\
    
    //Create (Crear)
    public void crear(Factura objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
    }
   
     //Read (Leer)
    public Factura read(int codigo){
        for (Factura factura : lista) {
            if(factura.getCodigo() == codigo){
                return factura;
            }
        }        
        return null;
    }
    
    //Update (Actualizar)
    public void update(Factura objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
     //Delete (Borrar)
    public void delete(int codigo){
        for (Factura factura : lista) {
            if(factura.getCodigo() == codigo){
                lista.remove(factura);
                break;
            }
        }  
    } 
    
    //Metodo que devuelve toda la lista
    public Set<Factura> getLista(){
            return lista;
    }
    
}
