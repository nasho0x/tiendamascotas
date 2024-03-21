package com.tiendamascota.tiendamascota;

public class Respuesta {
    private String respuesta;
    private Double valor;

    /**
     * Constructor de la clase Respuesta.
     * @param respuesta la respuesta
     * @param valor el valor
     */
    public Respuesta(String respuesta, Double valor) {
        this.respuesta = respuesta;
        this.valor = valor;
    }

    /**
     * Obtiene la respuesta.
     * @return la respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Establece la respuesta.
     * @param respuesta la respuesta
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Obtiene el valor.
     * @return el valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Establece el valor.
     * @param valor el valor
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
