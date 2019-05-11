/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author Domenika Delgado
 */
public class Cliente {
    
    //Atributos de la clase Cliente
    private int codigo;
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;

    
    //Constructores
    //Constructor Vacio
    public Cliente() {
    }

    //Constructor con todo los astributos de la Clase Cliente
    public Cliente(int codigo, String cedula, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    //toString
    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
    //hashCode con codigo & cedula
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.codigo;
        hash = 71 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    
    //equals con codigo & cedula
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }
    
}
