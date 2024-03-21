package com.tiendamascota.tiendamascota;

import java.util.Date;

public class Venta {
    private int id;
    private Producto producto;
    private int cantidad;
    private Date fechaVenta;

    /**
     * Constructor de la clase Venta.
     * @param id El ID de la venta.
     * @param producto El producto vendido.
     * @param cantidad La cantidad de productos vendidos.
     * @param fechaVenta La fecha de la venta.
     */
    public Venta(int id, Producto producto, int cantidad, Date fechaVenta) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
    }

    /**
     * Obtiene el ID de la venta.
     * @return El ID de la venta.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la venta.
     * @param id El ID de la venta.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el producto vendido.
     * @return el producto vendido
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto vendido.
     * @param producto el producto vendido
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene la cantidad de productos vendidos.
     * @return La cantidad de productos vendidos.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de productos vendidos.
     * @param cantidad La cantidad de productos vendidos.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la fecha de la venta.
     * @return La fecha de la venta.
     */
    public Date getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Establece la fecha de la venta.
     * @param fechaVenta La fecha de la venta.
     */
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}
