
package co.gov.colpensiones.schemas.consultaestadotramite;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.schemas.consultaestadotramite package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.schemas.consultaestadotramite
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaEstadoTramiteResponse }
     * 
     */
    public ConsultaEstadoTramiteResponse createConsultaEstadoTramiteResponse() {
        return new ConsultaEstadoTramiteResponse();
    }

    /**
     * Create an instance of {@link ConsultaEstadoTramiteRequest }
     * 
     */
    public ConsultaEstadoTramiteRequest createConsultaEstadoTramiteRequest() {
        return new ConsultaEstadoTramiteRequest();
    }

    /**
     * Create an instance of {@link ConsultaEstadoTramiteResponse.Estado }
     * 
     */
    public ConsultaEstadoTramiteResponse.Estado createConsultaEstadoTramiteResponseEstado() {
        return new ConsultaEstadoTramiteResponse.Estado();
    }

    /**
     * Create an instance of {@link ConsultaEstadoTramiteResponse.Tramite }
     * 
     */
    public ConsultaEstadoTramiteResponse.Tramite createConsultaEstadoTramiteResponseTramite() {
        return new ConsultaEstadoTramiteResponse.Tramite();
    }

    /**
     * Create an instance of {@link ConsultaEstadoTramiteResponse.EstadoHomologado }
     * 
     */
    public ConsultaEstadoTramiteResponse.EstadoHomologado createConsultaEstadoTramiteResponseEstadoHomologado() {
        return new ConsultaEstadoTramiteResponse.EstadoHomologado();
    }

    /**
     * Create an instance of {@link ConsultaEstadoTramiteResponse.Tiempos }
     * 
     */
    public ConsultaEstadoTramiteResponse.Tiempos createConsultaEstadoTramiteResponseTiempos() {
        return new ConsultaEstadoTramiteResponse.Tiempos();
    }

    /**
     * Create an instance of {@link ConsultaEstadoTramiteResponse.Error }
     * 
     */
    public ConsultaEstadoTramiteResponse.Error createConsultaEstadoTramiteResponseError() {
        return new ConsultaEstadoTramiteResponse.Error();
    }

}
