
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.wordpress.oreboladodeturing.wsdl.biblioteca_v1;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-03-16T17:52:36.165-03:00
 * Generated source version: 2.5.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "Biblioteca_v1_0",
                      portName = "SOAPOverHTTP",
                      targetNamespace = "http://oreboladodeturing.wordpress.com/wsdl/Biblioteca-v1/",
                      wsdlLocation = "file:/home/felipe/workspace/cxf-jaxws-webservice-example/WebContent/wsdl/Biblioteca-v1.wsdl",
                      endpointInterface = "com.wordpress.oreboladodeturing.wsdl.biblioteca_v1.BibliotecaV10")
                      
public class BibliotecaV10Impl implements BibliotecaV10 {

    private static final Logger LOG = Logger.getLogger(BibliotecaV10Impl.class.getName());

    /* (non-Javadoc)
     * @see com.wordpress.oreboladodeturing.wsdl.biblioteca_v1.BibliotecaV10#adicionarLivro(com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca.Livro  adicionarLivro )*
     */
    public java.lang.String adicionarLivro(com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca.Livro adicionarLivro) { 
        LOG.info("Executing operation adicionarLivro");
        System.out.println(adicionarLivro);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
