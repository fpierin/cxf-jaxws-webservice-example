
package com.wordpress.oreboladodeturing.wsdl.biblioteca_v1;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-03-16T17:52:36.268-03:00
 * Generated source version: 2.5.2
 * 
 */
 
public class BibliotecaV10_SOAPOverHTTP_Server{

    protected BibliotecaV10_SOAPOverHTTP_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new BibliotecaV10Impl();
        String address = "http://localhost:6001/cxf-jaxws-webservice-example/services/biblioteca";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new BibliotecaV10_SOAPOverHTTP_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}