package com.gestorCreditos.gestorCreditos.dominio.dto;

public class RegistroPersonaDtoDominio {
    private String mensaje;

    public RegistroPersonaDtoDominio(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
