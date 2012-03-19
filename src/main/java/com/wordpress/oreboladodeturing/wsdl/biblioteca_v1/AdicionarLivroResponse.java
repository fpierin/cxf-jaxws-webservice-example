
package com.wordpress.oreboladodeturing.wsdl.biblioteca_v1;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adicionarLivroResponse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adicionarLivroResponse"
})
@XmlRootElement(name = "adicionarLivroResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class AdicionarLivroResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String adicionarLivroResponse;

    /**
     * Gets the value of the adicionarLivroResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getAdicionarLivroResponse() {
        return adicionarLivroResponse;
    }

    /**
     * Sets the value of the adicionarLivroResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setAdicionarLivroResponse(String value) {
        this.adicionarLivroResponse = value;
    }

}
