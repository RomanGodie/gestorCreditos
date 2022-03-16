package com.gestorCreditos.gestorCreditos.dominio.modelo;

public class RegistroPersonaModelo {
    private int idPersona;
    private String numeroIdentificacionPersona;
    private String nombresYApellidos;
    private String correoElectronico;
    private String direccionResidencia;
    private String numeroTelefonico1;
    private String numeroTelefonico2;

    public RegistroPersonaModelo(int idPersona, String numeroIdentificacionPersona, String nombresYApellidos, String correoElectronico, String direccionResidencia, String numeroTelefonico1, String numeroTelefonico2) {
        this.idPersona = idPersona;
        this.numeroIdentificacionPersona = numeroIdentificacionPersona;
        this.nombresYApellidos = nombresYApellidos;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.numeroTelefonico1 = numeroTelefonico1;
        this.numeroTelefonico2 = numeroTelefonico2;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNumeroIdentificacionPersona() {
        return numeroIdentificacionPersona;
    }

    public void setNumeroIdentificacionPersona(String numeroIdentificacionPersona) {
        this.numeroIdentificacionPersona = numeroIdentificacionPersona;
    }

    public String getNombresYApellidos() {
        return nombresYApellidos;
    }

    public void setNombresYApellidos(String nombresYApellidos) {
        this.nombresYApellidos = nombresYApellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getNumeroTelefonico1() {
        return numeroTelefonico1;
    }

    public void setNumeroTelefonico1(String numeroTelefonico1) {
        this.numeroTelefonico1 = numeroTelefonico1;
    }

    public String getNumeroTelefonico2() {
        return numeroTelefonico2;
    }

    public void setNumeroTelefonico2(String numeroTelefonico2) {
        this.numeroTelefonico2 = numeroTelefonico2;
    }
}
