package com.wordpress.oreboladodeturing.wsdl.biblioteca_v1;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-03-18T16:53:56.768-03:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://oreboladodeturing.wordpress.com/wsdl/Biblioteca-v1/", name = "Biblioteca_v1_0")
@XmlSeeAlso({com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca.ObjectFactory.class, ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-03-18T16:53:56.768-03:00", comments = "Apache CXF 2.5.2")
public interface BibliotecaV10 {

    @WebResult(name = "adicionarLivroResponse", targetNamespace = "")
    @RequestWrapper(localName = "adicionarLivro", targetNamespace = "http://oreboladodeturing.wordpress.com/wsdl/Biblioteca-v1.0/", className = "com.wordpress.oreboladodeturing.wsdl.biblioteca_v1.AdicionarLivro")
    @WebMethod
    @ResponseWrapper(localName = "adicionarLivroResponse", targetNamespace = "http://oreboladodeturing.wordpress.com/wsdl/Biblioteca-v1.0/", className = "com.wordpress.oreboladodeturing.wsdl.biblioteca_v1.AdicionarLivroResponse")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2012-03-18T16:53:56.768-03:00")
    public java.lang.String adicionarLivro(
        @WebParam(name = "adicionarLivro", targetNamespace = "")
        com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca.Livro adicionarLivro
    );
}
