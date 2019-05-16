/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Domenika Delgado
 */
public class FacturaDetalle {
    
    //Atributos de la Clase FacturaDetalle
    private int codigoFactura;
    private int codigo;
    private double precio;
    private int cantidad;
    private double subtotal;
    private Producto producto;
    

    
    //Constructores
    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigoFactura, int codigo, double precio, int cantidad, double subtotal, Producto producto) {
        this.codigoFactura = codigoFactura;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.producto = producto;
    }
   
    //Getters & Setters
    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
   
    
    //toString
    @Override
    public String toString() {
        return "FacturaDetalle{" + "codigoFactura=" + codigoFactura + ", codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", producto=" + producto + '}';
    }
    
    
}
