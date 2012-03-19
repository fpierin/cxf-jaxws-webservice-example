
package com.wordpress.oreboladodeturing.xsd._2012._03.biblioteca;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Livro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Livro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="edtora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Livro", propOrder = {
    "codigo",
    "nome",
    "autor",
    "edtora"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
public class Livro {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String codigo;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String nome;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String autor;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    protected String edtora;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the autor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getAutor() {
        return autor;
    }

    /**
     * Sets the value of the autor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setAutor(String value) {
        this.autor = value;
    }

    /**
     * Gets the value of the edtora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public String getEdtora() {
        return edtora;
    }

    /**
     * Sets the value of the edtora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-03-18T04:53:56-03:00", comments = "JAXB RI vhudson-jaxb-ri-2.1-2")
    public void setEdtora(String value) {
        this.edtora = value;
    }

}
