package com.gestorCreditos.gestorCreditos.Infraestructura.controlador;

import com.gestorCreditos.gestorCreditos.Infraestructura.dto.RegistroPersonaDtoInfraestructura;
import com.gestorCreditos.gestorCreditos.aplicacion.servicio.IntermediarioRegistroPersonaServicio;
import com.gestorCreditos.gestorCreditos.dominio.dto.RegistroPersonaDtoDominio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registro")
@AllArgsConstructor
public class RegistroPersonaControlador {
   private IntermediarioRegistroPersonaServicio intermediarioRegistroPersonaServicio;

    @PostMapping()
    public RegistroPersonaDtoDominio almacenarPersona(@RequestBody RegistroPersonaDtoInfraestructura registroPersonaDtoInfraestructura){
        return intermediarioRegistroPersonaServicio.transaccionDeInfraestructuraADominio(registroPersonaDtoInfraestructura);
    }
}
