
package co.gov.colpensiones.portal.common.webservices.wsse.requestsystem;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.colpensiones.portal.common.webservices.wsse.requestsystem package. 
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

    private final static QName _System_QNAME = new QName("http://www.colpensiones.gov.co/portal/common/WebServices/WSSE/RequestSystem", "System");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.colpensiones.portal.common.webservices.wsse.requestsystem
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link System }
     * 
     */
    public System createSystem() {
        return new System();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link System }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.colpensiones.gov.co/portal/common/WebServices/WSSE/RequestSystem", name = "System")
    public JAXBElement<System> createSystem(System value) {
        return new JAXBElement<System>(_System_QNAME, System.class, null, value);
    }

}
