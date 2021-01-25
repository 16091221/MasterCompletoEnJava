package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
//@Primary //Permite seleccionar el candidato que queremos inyectar por defecto
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complicado...";
	}
	
	
}
