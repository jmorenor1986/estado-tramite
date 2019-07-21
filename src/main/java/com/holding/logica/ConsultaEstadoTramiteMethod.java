package com.holding.logica;

import com.holding.dto.SecurityDto;

import co.gov.colpensiones.portal.common.webservices.wsse.requestsystem.System;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteRequest;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteResponse;

public interface ConsultaEstadoTramiteMethod {
	/**
	 * Metodo con el cual llamo el metodo Consulta Tramite
	 * @return
	 */
	ConsultaEstadoTramiteResponse callMethod();
	
	/**
	 * Metodo con el cual seteo la seguridad
	 * @param security
	 */
	void setSecurity(SecurityDto security);
	/**
	 * Metodo con el cual seteo la seguridad
	 * @param header
	 */
	void setHeader(System header);
	/**
	 * Metodo con el cual seteo los parametros
	 * @param params
	 */
	void setParams(ConsultaEstadoTramiteRequest params);

}
