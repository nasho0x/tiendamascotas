package com.tiendamascota.tiendamascota;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiendaMascotaController {

    private List<Venta> ventas = new ArrayList<>();
    
    public TiendaMascotaController(){
        Producto producto1 = new Producto(1, "Pala para arena", 1000);
        Producto producto2 = new Producto(2, "Producto 2", 2000);
        Producto producto3 = new Producto(3, "Producto 3", 3000);


    }

    @GetMapping("/tiendamascota/obtenerGananciasDiarias")
    public Respuesta obtenerGananciasDiarias() {
        try {
            double ganancias = 0;
            Date fechaActual = new Date();
            for (Venta venta : ventas) {
                if (esMismaFecha(venta.getFechaVenta(), fechaActual)) {
                    ganancias += venta.getProducto().getValor() * venta.getCantidad();
                }
            }
            return new Respuesta("OK", ganancias);
        } catch (Exception e) {
            return new Respuesta("NOK", 0.0);
        }
    }

    @GetMapping("/tiendamascota/obtenerGananciasMensuales/{mes}")
    public Respuesta obtenerGananciasMensuales(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("El mes debe ser un valor válido (01 al 12)");
        }
        try {
            double ganancias = 0;
            Date fechaActual = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaActual);
            int anio = cal.get(Calendar.YEAR);
            for (Venta venta : ventas) {
                cal.setTime(venta.getFechaVenta());
                if (cal.get(Calendar.MONTH) == mes - 1 && cal.get(Calendar.YEAR) == anio) {
                    ganancias += venta.getProducto().getValor() * venta.getCantidad();
                }
            }
            return new Respuesta("OK", ganancias);
        } catch (Exception e) {
            return new Respuesta("NOK", 0.0);
        }
    }

    @GetMapping("/tiendamascota/obtenerGananciasAnuales/{anio}")
    public Respuesta obtenerGananciasAnuales(int anio) {
        if (anio < 1000 || anio > 9999) {
            throw new IllegalArgumentException("El año debe ser un valor válido (cuatro dígitos)");
        }
        try {
            double ganancias = 0;
            Date fechaActual = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaActual);
            for (Venta venta : ventas) {
                cal.setTime(venta.getFechaVenta());
                if (cal.get(Calendar.YEAR) == anio) {
                    ganancias += venta.getProducto().getValor() * venta.getCantidad();
                }
            }
            return new Respuesta("OK", ganancias);
        } catch (Exception e) {
            return new Respuesta("NOK", 0.0);
        }
    }

    private boolean esMismaFecha(Date fecha1, Date fecha2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(fecha1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(fecha2);
        return cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)
                && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
    }
}
