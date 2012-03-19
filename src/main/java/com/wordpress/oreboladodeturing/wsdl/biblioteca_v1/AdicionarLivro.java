
package com.wordpress.oreboladodeturing.wsdl.biblioteca_v1;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca.Livro;


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
 *         &lt;element name="adicionarLivro" type="{http://oreboladodeturing.wordpress.com/xsd/2012/03/Biblioteca/}Livro"/>
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
    "adicionarLivro"
})
@XmlRootElement(name = "adicionarLivro")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class AdicionarLivro {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected Livro adicionarLivro;

    /**
     * Gets the value of the adicionarLivro property.
     * 
     * @return
     *     possible object is
     *     {@link Livro }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public Livro getAdicionarLivro() {
        return adicionarLivro;
    }

    /**
     * Sets the value of the adicionarLivro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Livro }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setAdicionarLivro(Livro value) {
        this.adicionarLivro = value;
    }

}
