package com.holding.logica.impl;

import com.holding.dto.SecurityDto;
import com.holding.logica.ConsultaEstadoTramiteMethod;

import co.gov.colpensiones.portal.common.webservices.wsse.requestsystem.System;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteRequest;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteResponse;

public class ConsultaEstadoTramiteMethodImpl implements ConsultaEstadoTramiteMethod{

	private SecurityDto security;
	private System header;
	private ConsultaEstadoTramiteRequest params;
	
	@Override
	public ConsultaEstadoTramiteResponse callMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSecurity(SecurityDto security) {
		this.security = security;
	}

	@Override
	public void setHeader(System header) {
		this.header=header;
	}

	@Override
	public void setParams(ConsultaEstadoTramiteRequest params) {
		this.params = params;
	}

	

}
