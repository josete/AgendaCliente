
package agendasoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Validar", targetNamespace = "http://agendaSoap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Validar {


    /**
     * 
     * @return
     *     returns agendasoap.Agenda
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "devolverAgenda", targetNamespace = "http://agendaSoap/", className = "agendasoap.DevolverAgenda")
    @ResponseWrapper(localName = "devolverAgendaResponse", targetNamespace = "http://agendaSoap/", className = "agendasoap.DevolverAgendaResponse")
    @Action(input = "http://agendaSoap/Validar/devolverAgendaRequest", output = "http://agendaSoap/Validar/devolverAgendaResponse")
    public Agenda devolverAgenda();

    /**
     * 
     * @param arg0
     * @return
     *     returns agendasoap.Persona
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "devolverPersona", targetNamespace = "http://agendaSoap/", className = "agendasoap.DevolverPersona")
    @ResponseWrapper(localName = "devolverPersonaResponse", targetNamespace = "http://agendaSoap/", className = "agendasoap.DevolverPersonaResponse")
    @Action(input = "http://agendaSoap/Validar/devolverPersonaRequest", output = "http://agendaSoap/Validar/devolverPersonaResponse")
    public Persona devolverPersona(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarAgenda", targetNamespace = "http://agendaSoap/", className = "agendasoap.ValidarAgenda")
    @ResponseWrapper(localName = "validarAgendaResponse", targetNamespace = "http://agendaSoap/", className = "agendasoap.ValidarAgendaResponse")
    @Action(input = "http://agendaSoap/Validar/validarAgendaRequest", output = "http://agendaSoap/Validar/validarAgendaResponse")
    public boolean validarAgenda(
        @WebParam(name = "arg0", targetNamespace = "")
        Agenda arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "insertarPersona", targetNamespace = "http://agendaSoap/", className = "agendasoap.InsertarPersona")
    @ResponseWrapper(localName = "insertarPersonaResponse", targetNamespace = "http://agendaSoap/", className = "agendasoap.InsertarPersonaResponse")
    @Action(input = "http://agendaSoap/Validar/insertarPersonaRequest", output = "http://agendaSoap/Validar/insertarPersonaResponse")
    public void insertarPersona(
        @WebParam(name = "arg0", targetNamespace = "")
        Persona arg0);

}
