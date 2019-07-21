package com.holding.logica.impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxb.JAXBDataBinding;

import com.holding.dto.SecurityDto;
import com.holding.logica.ConsultaEstadoTramiteMethod;

import co.gov.colpensiones.portal.common.webservices.wsse.requestsystem.System;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteRequest;
import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteResponse;
import co.gov.colpensiones.services.consultaestadotramite.ConsultaEstadoTramite;
import co.gov.colpensiones.services.consultaestadotramite.ConsultaEstadoTramite_Service;

public class ConsultaEstadoTramiteMethodImpl implements ConsultaEstadoTramiteMethod {

	private static final QName SERVICE_NAME = new QName("http://www.colpensiones.gov.co/services/ConsultaEstadoTramite",
			"ConsultaEstadoTramite");

	private ConsultaEstadoTramite_Service service;
	private ConsultaEstadoTramite port;

	private SecurityDto security;
	private System header;
	private ConsultaEstadoTramiteRequest params;

	public ConsultaEstadoTramiteMethodImpl() {
		super();
		try {
			service = new ConsultaEstadoTramite_Service(
					new URL("http://10.130.70.126:13040/Colpensiones/Services/ConsultaEstadoTramite?wsdl"),
					SERVICE_NAME);
			port = service.getConsultaEstadoTramitePort();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ConsultaEstadoTramiteResponse callMethod() {
		preparedObjects();
		return port.estadoTramite(params);
	}

	private void preparedObjects() {
		try {
			Client client = ClientProxy.getClient(port);
			client.getInInterceptors().add(new LoggingInInterceptor());
			client.getOutInterceptors().add(new LoggingOutInterceptor());

			List<Header> headersList = new ArrayList<Header>();

			Header testSoapHeader1 = new Header(new QName("System"), header, new JAXBDataBinding(System.class));
			Header testSoapHeader2 = new Header(
					new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd",
							"Security"),
					security, new JAXBDataBinding(SecurityDto.class));
			headersList.add(testSoapHeader1);
			headersList.add(testSoapHeader2);
			/// Adicion de cabeceras
			client.getRequestContext().put(Header.HEADER_LIST, headersList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setSecurity(SecurityDto security) {
		this.security = security;
	}

	@Override
	public void setHeader(System header) {
		this.header = header;
	}

	@Override
	public void setParams(ConsultaEstadoTramiteRequest params) {
		this.params = params;
	}

	public SecurityDto getSecurity() {
		return security;
	}

	public System getHeader() {
		return header;
	}

	public ConsultaEstadoTramiteRequest getParams() {
		return params;
	}

}
