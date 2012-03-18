package com.wordpress.oreboladodeturing.wsdl.biblioteca_v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-03-17T23:46:13.355-03:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "Biblioteca_v1_0", 
                  wsdlLocation = "file:/host/works/Desenvolvimento/Java/workspace/cxf-jaxws-webservice-example/src/main/resources/wsdl/Biblioteca-v1.wsdl",
                  targetNamespace = "http://oreboladodeturing.wordpress.com/wsdl/Biblioteca-v1/") 
public class BibliotecaV10_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://oreboladodeturing.wordpress.com/wsdl/Biblioteca-v1/", "Biblioteca_v1_0");
    public final static QName SOAPOverHTTP = new QName("http://oreboladodeturing.wordpress.com/wsdl/Biblioteca-v1/", "SOAPOverHTTP");
    static {
        URL url = null;
        try {
            url = new URL("file:/host/works/Desenvolvimento/Java/workspace/cxf-jaxws-webservice-example/src/main/resources/wsdl/Biblioteca-v1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BibliotecaV10_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/host/works/Desenvolvimento/Java/workspace/cxf-jaxws-webservice-example/src/main/resources/wsdl/Biblioteca-v1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BibliotecaV10_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BibliotecaV10_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BibliotecaV10_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns BibliotecaV10
     */
    @WebEndpoint(name = "SOAPOverHTTP")
    public BibliotecaV10 getSOAPOverHTTP() {
        return super.getPort(SOAPOverHTTP, BibliotecaV10.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BibliotecaV10
     */
    @WebEndpoint(name = "SOAPOverHTTP")
    public BibliotecaV10 getSOAPOverHTTP(WebServiceFeature... features) {
        return super.getPort(SOAPOverHTTP, BibliotecaV10.class, features);
    }

}
