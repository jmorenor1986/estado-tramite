package com.holding;

import java.util.logging.Logger;

import com.holding.dto.SecurityDto;
import com.holding.logica.ConsultaEstadoTramiteMethod;
import com.holding.logica.impl.ConsultaEstadoTramiteMethodImpl;

import co.gov.colpensiones.portal.common.webservices.wsse.requestsystem.System;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteRequest;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteResponse;

public class Application {
	
	private final static Logger LOGGER = Logger.getLogger("com.holding.Application");
	
	public static void main(String ...args) {
		ConsultaEstadoTramiteMethod consulta = new ConsultaEstadoTramiteMethodImpl();
		ConsultaEstadoTramiteRequest params = ConsultaEstadoTramiteRequest.of("29677700", "2019_486", "CC");
		System headerUno = System.of("210620191235");
		SecurityDto securityDto = SecurityDto.of("uuid-7cee5976-0111-e9c1-e34b-af1e85fa3866", "apstramites", "Acceso4068");
		
		consulta.setHeader(headerUno);
		consulta.setSecurity(securityDto);
		consulta.setParams(params);
		
		ConsultaEstadoTramiteResponse respuesta = consulta.callMethod();
		LOGGER.info("respuesta: ..." + respuesta.getEstado() );
	}

}
