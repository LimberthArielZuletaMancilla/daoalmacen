package com.emergentes.modelo;
public class Producto {

    private int id;
    private String descripcion;
    private int cantidad;
    private float precio;
    private String Categoria;
    public Producto() {
        id = 0;
        descripcion = "";
        cantidad = 0;
        precio = 0;
        Categoria = "";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", precio=" + precio + ", Categoria=" + Categoria + '}';
    }

}
