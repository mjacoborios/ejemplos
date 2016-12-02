
package com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para monitoreoMensualODMVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="monitoreoMensualODMVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numComprasRealizadas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPagosVencidosMes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pagoBxI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoreoMensualODMVO", propOrder = {
    "numComprasRealizadas",
    "numPagosVencidosMes",
    "pagoBxI"
})
public class MonitoreoMensualODMVO {

    protected Integer numComprasRealizadas;
    protected Integer numPagosVencidosMes;
    protected Boolean pagoBxI;

    /**
     * Obtiene el valor de la propiedad numComprasRealizadas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumComprasRealizadas() {
        return numComprasRealizadas;
    }

    /**
     * Define el valor de la propiedad numComprasRealizadas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumComprasRealizadas(Integer value) {
        this.numComprasRealizadas = value;
    }

    /**
     * Obtiene el valor de la propiedad numPagosVencidosMes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPagosVencidosMes() {
        return numPagosVencidosMes;
    }

    /**
     * Define el valor de la propiedad numPagosVencidosMes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPagosVencidosMes(Integer value) {
        this.numPagosVencidosMes = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoBxI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPagoBxI() {
        return pagoBxI;
    }

    /**
     * Define el valor de la propiedad pagoBxI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPagoBxI(Boolean value) {
        this.pagoBxI = value;
    }

}
