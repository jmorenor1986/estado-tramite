
package co.gov.colpensiones.services.consultaestadotramite;

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
import org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.AttributedString;
import org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.UsernameTokenType;

import com.holding.dto.SecurityDto;
import com.holding.dto.UsernameToken;

import co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteRequest;

/**
 * This class was generated by Apache CXF 3.2.6 2019-07-20T12:05:07.666-05:00
 * Generated source version: 3.2.6
 *
 */
public final class ConsultaEstadoTramite_ConsultaEstadoTramitePort_Client {

	private static final QName SERVICE_NAME = new QName("http://www.colpensiones.gov.co/services/ConsultaEstadoTramite",
			"ConsultaEstadoTramite");

	private ConsultaEstadoTramite_ConsultaEstadoTramitePort_Client() {
	}

	public static void main(String args[]) throws java.lang.Exception {
		
		ConsultaEstadoTramite_Service ss = new ConsultaEstadoTramite_Service(
				new URL("http://10.130.70.126:13040/Colpensiones/Services/ConsultaEstadoTramite?wsdl"), SERVICE_NAME);
		ConsultaEstadoTramite port = ss.getConsultaEstadoTramitePort();
		Client client = ClientProxy.getClient(port);
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingOutInterceptor());		
		// Create a list for holding all SOAP headers
		List<Header> headersList = new ArrayList<Header>();
//		QName hijoUno =  new QName("http://www.colpensiones.gov.co/portal/common/WebServices/WSSE/RequestSystem", "req:System");
//		QName hijoUno =  new QName("http://www.colpensiones.gov.co/portal/common/WebServices/WSSE/RequestSystem", "req:System");
//		
		
		co.gov.colpensiones.portal.common.webservices.wsse.requestsystem.System prueba= new co.gov.colpensiones.portal.common.webservices.wsse.requestsystem.System();
		prueba.setIP("");
		prueba.setTransactionID("210620191235");
		prueba.setApplicationID("");
		
		
		UsernameTokenType prueba2 = new UsernameTokenType();
		AttributedString prueba3 = new AttributedString();
		prueba3.setValue("apstramites");
		prueba2.setUsername(prueba3);
		SecurityDto security = new SecurityDto();
		security.setUser(new UsernameToken());
		security.getUser().setId("uuid-7cee5976-0111-e9c1-e34b-af1e85fa3866");
		security.getUser().setPassword("Acceso4068");
		security.getUser().setUserName("apstramites");
		
		Header testSoapHeader1 = new Header(new QName("System"),prueba, new JAXBDataBinding(co.gov.colpensiones.portal.common.webservices.wsse.requestsystem.System.class) );
		Header testSoapHeader2 = new Header(new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security"),security, new JAXBDataBinding(SecurityDto.class));

		headersList.add(testSoapHeader1);
		headersList.add(testSoapHeader2);
		
		///Adicion de cabeceras
		
		client.getRequestContext().put(Header.HEADER_LIST, headersList);
		
		{
			System.out.println("Invoking estadoTramite...");
			co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteRequest _estadoTramite_parameters = new ConsultaEstadoTramiteRequest();
			_estadoTramite_parameters.setDocumento("29677700");
			_estadoTramite_parameters.setRadicado("2019_486");
			_estadoTramite_parameters.setTipoDocumento("CC");
			co.gov.colpensiones.schemas.consultaestadotramite.ConsultaEstadoTramiteResponse _estadoTramite__return = port
					.estadoTramite(_estadoTramite_parameters);
			System.out.println("estadoTramite.result=" + _estadoTramite__return);

		}

		System.exit(0);
	}

}