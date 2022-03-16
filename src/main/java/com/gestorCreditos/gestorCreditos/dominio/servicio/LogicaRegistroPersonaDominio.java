package com.gestorCreditos.gestorCreditos.dominio.servicio;

import com.gestorCreditos.gestorCreditos.dominio.dto.RegistroPersonaDtoDominio;
import com.gestorCreditos.gestorCreditos.dominio.modelo.RegistroPersonaModelo;
import com.gestorCreditos.gestorCreditos.dominio.puerto.PuertoRegistroPersona;

public class LogicaRegistroPersonaDominio {
    PuertoRegistroPersona puertoRegistroPersona;

    public LogicaRegistroPersonaDominio(PuertoRegistroPersona puertoRegistroPersona) {
        this.puertoRegistroPersona = puertoRegistroPersona;
    }

    public RegistroPersonaDtoDominio LogicaDeNegocioRegistroPersona(RegistroPersonaModelo registroPersonaModelo){
        try{
            puertoRegistroPersona.createRegistroPersona(registroPersonaModelo);
            return new RegistroPersonaDtoDominio("Estoy almacenando persona con identificacion: "+
                    registroPersonaModelo.getNumeroIdentificacionPersona()+
                    " en la logica de negocio");
        }catch (Error e){
            return new RegistroPersonaDtoDominio("Error de Almacenamiento");
        }
    }
}
