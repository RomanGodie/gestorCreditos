package com.gestorCreditos.gestorCreditos.aplicacion.servicio;

import com.gestorCreditos.gestorCreditos.Infraestructura.dto.RegistroPersonaDtoInfraestructura;
import com.gestorCreditos.gestorCreditos.aplicacion.mapper.MapperRegistroPersona;
import com.gestorCreditos.gestorCreditos.dominio.dto.RegistroPersonaDtoDominio;
import com.gestorCreditos.gestorCreditos.dominio.servicio.LogicaRegistroPersonaDominio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class IntermediarioRegistroPersonaServicio {
    private MapperRegistroPersona mapperRegistroPersona;
    private LogicaRegistroPersonaDominio logicaRegistroPersonaDominio;

    public RegistroPersonaDtoDominio transaccionDeInfraestructuraADominio(RegistroPersonaDtoInfraestructura registroPersonaDtoInfraestructura){
        return logicaRegistroPersonaDominio.LogicaDeNegocioRegistroPersona(mapperRegistroPersona.
                conversorDeRegistroPersonaInfraestructuraARegistroPersonaModelo(registroPersonaDtoInfraestructura));
    }
}
