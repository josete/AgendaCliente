
package agendasoap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Agenda", targetNamespace = "http://agendaSoap/", wsdlLocation = "http://localhost:8080/SoapAgenda/Agenda?wsdl")
public class Agenda_Service
    extends Service
{

    private final static URL AGENDA_WSDL_LOCATION;
    private final static WebServiceException AGENDA_EXCEPTION;
    private final static QName AGENDA_QNAME = new QName("http://agendaSoap/", "Agenda");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SoapAgenda/Agenda?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AGENDA_WSDL_LOCATION = url;
        AGENDA_EXCEPTION = e;
    }

    public Agenda_Service() {
        super(__getWsdlLocation(), AGENDA_QNAME);
    }

    public Agenda_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), AGENDA_QNAME, features);
    }

    public Agenda_Service(URL wsdlLocation) {
        super(wsdlLocation, AGENDA_QNAME);
    }

    public Agenda_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AGENDA_QNAME, features);
    }

    public Agenda_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Agenda_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Validar
     */
    @WebEndpoint(name = "ValidarPort")
    public Validar getValidarPort() {
        return super.getPort(new QName("http://agendaSoap/", "ValidarPort"), Validar.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Validar
     */
    @WebEndpoint(name = "ValidarPort")
    public Validar getValidarPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://agendaSoap/", "ValidarPort"), Validar.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AGENDA_EXCEPTION!= null) {
            throw AGENDA_EXCEPTION;
        }
        return AGENDA_WSDL_LOCATION;
    }

}
