package com.tiendamascota.tiendamascota;

public class Producto {
    private int id;
    private String nombre;
    private int valor;

    /**
     * Constructor de la clase Producto.
     * @param id el ID del producto
     * @param nombre el nombre del producto
     * @param valor el valor del producto
     */
    public Producto(int id, String nombre, int valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }

    /**
     * Método getter para obtener el ID del producto.
     * @return el ID del producto
     */
    public int getId() {
        return id;
    }

    /**
     * Método setter para establecer el ID del producto.
     * @param id el ID del producto
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método getter para obtener el nombre del producto.
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre del producto.
     * @param nombre el nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el valor del producto.
     * @return el valor del producto
     */
    public int getValor() {
        return valor;
    }

    /**
     * Método setter para establecer el valor del producto.
     * @param valor el valor del producto
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
