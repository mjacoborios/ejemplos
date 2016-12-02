
package com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.param;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="monitoreo123xMi" type="{http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules}monitoreo123XMi"/>
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
    "monitoreo123XMi"
})
@XmlRootElement(name = "monitoreo123xMi")
public class Monitoreo123XMi {

    @XmlElement(name = "monitoreo123xMi", required = true)
    protected com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi monitoreo123XMi;

    /**
     * Obtiene el valor de la propiedad monitoreo123XMi.
     * 
     * @return
     *     possible object is
     *     {@link com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi }
     *     
     */
    public com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi getMonitoreo123XMi() {
        return monitoreo123XMi;
    }

    /**
     * Define el valor de la propiedad monitoreo123XMi.
     * 
     * @param value
     *     allowed object is
     *     {@link com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi }
     *     
     */
    public void setMonitoreo123XMi(com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.Monitoreo123XMi value) {
        this.monitoreo123XMi = value;
    }

}
