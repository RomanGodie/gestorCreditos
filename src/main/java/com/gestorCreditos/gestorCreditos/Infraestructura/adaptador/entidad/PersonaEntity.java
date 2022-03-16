package com.gestorCreditos.gestorCreditos.Infraestructura.adaptador.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "persona")
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpersona")
    private int idPersona;
    @Column(name = "numeroidentificacionpersona")
    private String numeroIdentificacionPersona;
    @Column(name = "nombresyapellidos")
    private String nombresYApellidos;
    @Column(name = "correoelectronico")
    private String correoElectronico;
    @Column(name = "direccionresidencia")
    private String direccionResidencia;
    @Column(name = "numerotelefonico1")
    private String numeroTelefonico1;
    @Column(name = "numerotelefonico2")
    private String numeroTelefonico2;
}
