package org.scesar.api.stream.ejemplos.models;

public class Factura {

    private String drescripcion;
    private Usuario usuario;

    public String getDrescripcion() {
        return drescripcion;
    }

    public Factura(String drescripcion) {
        this.drescripcion = drescripcion;
    }

    public void setDrescripcion(String drescripcion) {
        this.drescripcion = drescripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
