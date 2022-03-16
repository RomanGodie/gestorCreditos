package com.gestorCreditos.gestorCreditos.Infraestructura.configuracion;

import com.gestorCreditos.gestorCreditos.dominio.puerto.PuertoRegistroPersona;
import com.gestorCreditos.gestorCreditos.dominio.servicio.LogicaRegistroPersonaDominio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracion {

    @Bean
    public LogicaRegistroPersonaDominio inyeccionDeLogicaRegistroPersonaDominio(PuertoRegistroPersona puertoRegistroPersona){
        return new LogicaRegistroPersonaDominio(puertoRegistroPersona);
    }
}
