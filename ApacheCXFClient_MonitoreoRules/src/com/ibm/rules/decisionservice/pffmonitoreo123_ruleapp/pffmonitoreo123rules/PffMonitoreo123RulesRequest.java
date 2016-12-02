
package com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules.param.Monitoreo123XMi;


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
 *         &lt;element name="DecisionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules/param}monitoreo123xMi"/>
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
    "decisionID",
    "monitoreo123XMi"
})
@XmlRootElement(name = "PffMonitoreo123rulesRequest")
public class PffMonitoreo123RulesRequest {

    @XmlElement(name = "DecisionID", namespace = "http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules")
    protected String decisionID;
    @XmlElement(name = "monitoreo123xMi", namespace = "http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules/param", required = true)
    protected Monitoreo123XMi monitoreo123XMi;

    /**
     * Obtiene el valor de la propiedad decisionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionID() {
        return decisionID;
    }

    /**
     * Define el valor de la propiedad decisionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionID(String value) {
        this.decisionID = value;
    }

    /**
     * Obtiene el valor de la propiedad monitoreo123XMi.
     * 
     * @return
     *     possible object is
     *     {@link Monitoreo123XMi }
     *     
     */
    public Monitoreo123XMi getMonitoreo123XMi() {
        return monitoreo123XMi;
    }

    /**
     * Define el valor de la propiedad monitoreo123XMi.
     * 
     * @param value
     *     allowed object is
     *     {@link Monitoreo123XMi }
     *     
     */
    public void setMonitoreo123XMi(Monitoreo123XMi value) {
        this.monitoreo123XMi = value;
    }

}
