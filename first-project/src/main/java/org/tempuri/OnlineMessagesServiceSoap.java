package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-730040-redhat-00001
 * 2019-11-21T12:48:22.311+01:00
 * Generated source version: 3.2.7.fuse-730040-redhat-00001
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "OnlineMessagesServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface OnlineMessagesServiceSoap {

    /**
     * This methods allows clients to ping server application defined by input parameter messageHandlerApplication
     */
    @WebMethod(operationName = "Ping", action = "http://tempuri.org/Ping")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.PingResponse")
    @WebResult(name = "PingResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String ping(
        @WebParam(name = "messageHandlerApplication", targetNamespace = "http://tempuri.org/")
        java.lang.String messageHandlerApplication
    );

    /**
     * This Method allows clients to request data from a predefined set of server applications.<br>Parameters :<br>&nbsp;   messageHandlerApplication - name  of application to invoke.<br>&nbsp;   chain - id of chain requesting data.<br>&nbsp;   branch - id of branch requesting data.<BR>&nbsp;   messageData - request data.
     */
    @WebMethod(operationName = "RequestData", action = "http://tempuri.org/RequestData")
    @RequestWrapper(localName = "RequestData", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RequestData")
    @ResponseWrapper(localName = "RequestDataResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RequestDataResponse")
    @WebResult(name = "RequestDataResult", targetNamespace = "http://tempuri.org/")
    public java.lang.String requestData(
        @WebParam(name = "messageHandlerApplication", targetNamespace = "http://tempuri.org/")
        java.lang.String messageHandlerApplication,
        @WebParam(name = "chain", targetNamespace = "http://tempuri.org/")
        java.lang.String chain,
        @WebParam(name = "branch", targetNamespace = "http://tempuri.org/")
        java.lang.String branch,
        @WebParam(name = "messageData", targetNamespace = "http://tempuri.org/")
        java.lang.String messageData
    );
}