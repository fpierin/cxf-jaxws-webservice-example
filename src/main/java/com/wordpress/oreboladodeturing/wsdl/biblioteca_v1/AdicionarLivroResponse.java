
package com.wordpress.oreboladodeturing.wsdl.biblioteca_v1;

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
public class AdicionarLivroResponse {

    @XmlElement(required = true)
    protected String adicionarLivroResponse;

    /**
     * Gets the value of the adicionarLivroResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setAdicionarLivroResponse(String value) {
        this.adicionarLivroResponse = value;
    }

}
