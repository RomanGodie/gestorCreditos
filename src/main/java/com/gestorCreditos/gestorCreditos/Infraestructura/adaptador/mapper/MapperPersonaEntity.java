package com.gestorCreditos.gestorCreditos.Infraestructura.adaptador.mapper;

import com.gestorCreditos.gestorCreditos.Infraestructura.adaptador.entidad.PersonaEntity;
import com.gestorCreditos.gestorCreditos.dominio.modelo.RegistroPersonaModelo;
import org.springframework.stereotype.Component;

@Component
public class MapperPersonaEntity {
    public PersonaEntity conversorDeRegistroPersonaModeloAPersonaEntity(RegistroPersonaModelo registroPersonaModelo){
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setIdPersona(registroPersonaModelo.getIdPersona());
        personaEntity.setNumeroIdentificacionPersona(registroPersonaModelo.getNumeroIdentificacionPersona());
        personaEntity.setNombresYApellidos(registroPersonaModelo.getNombresYApellidos());
        personaEntity.setCorreoElectronico(registroPersonaModelo.getCorreoElectronico());
        personaEntity.setDireccionResidencia(registroPersonaModelo.getDireccionResidencia());
        personaEntity.setNumeroTelefonico1(registroPersonaModelo.getNumeroTelefonico1());
        personaEntity.setNumeroTelefonico2(registroPersonaModelo.getNumeroTelefonico2());
        return personaEntity;
    }
}
