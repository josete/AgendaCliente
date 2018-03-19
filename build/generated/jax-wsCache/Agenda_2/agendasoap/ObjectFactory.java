
package agendasoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the agendasoap package. 
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

    private final static QName _ValidarAgendaResponse_QNAME = new QName("http://agendaSoap/", "validarAgendaResponse");
    private final static QName _Agenda_QNAME = new QName("http://agendaSoap/", "Agenda");
    private final static QName _DevolverPersona_QNAME = new QName("http://agendaSoap/", "devolverPersona");
    private final static QName _ValidarAgenda_QNAME = new QName("http://agendaSoap/", "validarAgenda");
    private final static QName _Persona_QNAME = new QName("http://agendaSoap/", "Persona");
    private final static QName _DevolverPersonaResponse_QNAME = new QName("http://agendaSoap/", "devolverPersonaResponse");
    private final static QName _DevolverAgendaResponse_QNAME = new QName("http://agendaSoap/", "devolverAgendaResponse");
    private final static QName _DevolverAgenda_QNAME = new QName("http://agendaSoap/", "devolverAgenda");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: agendasoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarAgenda }
     * 
     */
    public ValidarAgenda createValidarAgenda() {
        return new ValidarAgenda();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link DevolverPersonaResponse }
     * 
     */
    public DevolverPersonaResponse createDevolverPersonaResponse() {
        return new DevolverPersonaResponse();
    }

    /**
     * Create an instance of {@link DevolverAgendaResponse }
     * 
     */
    public DevolverAgendaResponse createDevolverAgendaResponse() {
        return new DevolverAgendaResponse();
    }

    /**
     * Create an instance of {@link DevolverAgenda }
     * 
     */
    public DevolverAgenda createDevolverAgenda() {
        return new DevolverAgenda();
    }

    /**
     * Create an instance of {@link ValidarAgendaResponse }
     * 
     */
    public ValidarAgendaResponse createValidarAgendaResponse() {
        return new ValidarAgendaResponse();
    }

    /**
     * Create an instance of {@link Agenda }
     * 
     */
    public Agenda createAgenda() {
        return new Agenda();
    }

    /**
     * Create an instance of {@link DevolverPersona }
     * 
     */
    public DevolverPersona createDevolverPersona() {
        return new DevolverPersona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarAgendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "validarAgendaResponse")
    public JAXBElement<ValidarAgendaResponse> createValidarAgendaResponse(ValidarAgendaResponse value) {
        return new JAXBElement<ValidarAgendaResponse>(_ValidarAgendaResponse_QNAME, ValidarAgendaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "Agenda")
    public JAXBElement<Agenda> createAgenda(Agenda value) {
        return new JAXBElement<Agenda>(_Agenda_QNAME, Agenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "devolverPersona")
    public JAXBElement<DevolverPersona> createDevolverPersona(DevolverPersona value) {
        return new JAXBElement<DevolverPersona>(_DevolverPersona_QNAME, DevolverPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarAgenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "validarAgenda")
    public JAXBElement<ValidarAgenda> createValidarAgenda(ValidarAgenda value) {
        return new JAXBElement<ValidarAgenda>(_ValidarAgenda_QNAME, ValidarAgenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "Persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "devolverPersonaResponse")
    public JAXBElement<DevolverPersonaResponse> createDevolverPersonaResponse(DevolverPersonaResponse value) {
        return new JAXBElement<DevolverPersonaResponse>(_DevolverPersonaResponse_QNAME, DevolverPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverAgendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "devolverAgendaResponse")
    public JAXBElement<DevolverAgendaResponse> createDevolverAgendaResponse(DevolverAgendaResponse value) {
        return new JAXBElement<DevolverAgendaResponse>(_DevolverAgendaResponse_QNAME, DevolverAgendaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DevolverAgenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://agendaSoap/", name = "devolverAgenda")
    public JAXBElement<DevolverAgenda> createDevolverAgenda(DevolverAgenda value) {
        return new JAXBElement<DevolverAgenda>(_DevolverAgenda_QNAME, DevolverAgenda.class, null, value);
    }

}
