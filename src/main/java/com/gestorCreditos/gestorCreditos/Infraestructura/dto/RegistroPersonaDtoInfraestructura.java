package com.gestorCreditos.gestorCreditos.Infraestructura.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegistroPersonaDtoInfraestructura {
    private int idPersona;
    private String numeroIdentificacionPersona;
    private String nombresYApellidos;
    private String correoElectronico;
    private String direccionResidencia;
    private String numeroTelefonico1;
    private String numeroTelefonico2;
}
