//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.6 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.08.04 a las 12:00:59 PM PET 
//


package com.soap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultiplyResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "multiplyResult"
})
@XmlRootElement(name = "MultiplyResponse")
public class MultiplyResponse {

    @XmlElement(name = "MultiplyResult")
    protected int multiplyResult;

    /**
     * Obtiene el valor de la propiedad multiplyResult.
     * 
     */
    public int getMultiplyResult() {
        return multiplyResult;
    }

    /**
     * Define el valor de la propiedad multiplyResult.
     * 
     */
    public void setMultiplyResult(int value) {
        this.multiplyResult = value;
    }

}
