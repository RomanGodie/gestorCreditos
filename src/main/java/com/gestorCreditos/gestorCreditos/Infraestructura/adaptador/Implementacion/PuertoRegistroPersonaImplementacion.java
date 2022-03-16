package com.gestorCreditos.gestorCreditos.Infraestructura.adaptador.Implementacion;

import com.gestorCreditos.gestorCreditos.Infraestructura.adaptador.mapper.MapperPersonaEntity;
import com.gestorCreditos.gestorCreditos.dominio.modelo.RegistroPersonaModelo;
import com.gestorCreditos.gestorCreditos.dominio.puerto.PuertoRegistroPersona;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
@AllArgsConstructor
public class PuertoRegistroPersonaImplementacion implements PuertoRegistroPersona {
    EntityManager entityManager;
    MapperPersonaEntity mapperPersonaEntity;

    @Override
    public void createRegistroPersona(RegistroPersonaModelo registroPersonaModelo) {
        entityManager.merge(mapperPersonaEntity.conversorDeRegistroPersonaModeloAPersonaEntity(registroPersonaModelo));
    }
}
