package com.gestorCreditos.gestorCreditos.aplicacion.mapper;

import com.gestorCreditos.gestorCreditos.Infraestructura.dto.RegistroPersonaDtoInfraestructura;
import com.gestorCreditos.gestorCreditos.dominio.modelo.RegistroPersonaModelo;
import org.springframework.stereotype.Component;

@Component
public class MapperRegistroPersona {
    public RegistroPersonaModelo conversorDeRegistroPersonaInfraestructuraARegistroPersonaModelo(RegistroPersonaDtoInfraestructura registroPersonaDtoInfraestructura){
        return new RegistroPersonaModelo(registroPersonaDtoInfraestructura.getIdPersona(),
                registroPersonaDtoInfraestructura.getNumeroIdentificacionPersona(),
                registroPersonaDtoInfraestructura.getNombresYApellidos(),
                registroPersonaDtoInfraestructura.getCorreoElectronico(),
                registroPersonaDtoInfraestructura.getDireccionResidencia(),
                registroPersonaDtoInfraestructura.getNumeroTelefonico1(),
                registroPersonaDtoInfraestructura.getNumeroTelefonico2());
    }
}
