
package com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para monitoreo123XMi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="monitoreo123XMi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveDefinitiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveEmpaquetamiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clavePagosBxI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clavePagosVencidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clavePenalizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveTransacciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractDetails" type="{http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules}contractDetailsODMVO" minOccurs="0"/>
 *         &lt;element name="contractDetailsList" type="{http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules}contractDetailsODMVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cumpleCondiciones" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="descripcionError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esBaja" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="esCuentaActiva" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="estaEnUltimos3Meses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaCancelacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaFinCorteAnteriorMonitoreo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mes1Antes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mes2Antes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mesFechaCancelacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mesMonitoreoActual" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mesMonitoreoAnterior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="monitoreoMensualMes1" type="{http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules}monitoreoMensualODMVO" minOccurs="0"/>
 *         &lt;element name="monitoreoMensualMes2" type="{http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules}monitoreoMensualODMVO" minOccurs="0"/>
 *         &lt;element name="monitoreoMensualMes3" type="{http://www.ibm.com/rules/decisionservice/PffMonitoreo123_RuleApp/PffMonitoreo123rules}monitoreoMensualODMVO" minOccurs="0"/>
 *         &lt;element name="numTrimestreSigAnualidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tieneCuentaCaptacionBxI" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "monitoreo123XMi", propOrder = {
    "claveDefinitiva",
    "claveEmpaquetamiento",
    "clavePagosBxI",
    "clavePagosVencidos",
    "clavePenalizacion",
    "claveTransacciones",
    "contractDetails",
    "contractDetailsList",
    "cumpleCondiciones",
    "descripcionError",
    "esBaja",
    "esCuentaActiva",
    "estaEnUltimos3Meses",
    "fechaCancelacion",
    "fechaFinCorteAnteriorMonitoreo",
    "mes1Antes",
    "mes2Antes",
    "mesFechaCancelacion",
    "mesMonitoreoActual",
    "mesMonitoreoAnterior",
    "monitoreoMensualMes1",
    "monitoreoMensualMes2",
    "monitoreoMensualMes3",
    "numTrimestreSigAnualidad",
    "tieneCuentaCaptacionBxI"
})
@XmlRootElement
public class Monitoreo123XMi {

    protected String claveDefinitiva;
    protected String claveEmpaquetamiento;
    protected String clavePagosBxI;
    protected String clavePagosVencidos;
    protected String clavePenalizacion;
    protected String claveTransacciones;
    protected ContractDetailsODMVO contractDetails;
    @XmlElement(nillable = true)
    protected List<ContractDetailsODMVO> contractDetailsList;
    protected Boolean cumpleCondiciones;
    protected String descripcionError;
    protected Boolean esBaja;
    protected Boolean esCuentaActiva;
    protected Boolean estaEnUltimos3Meses;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCancelacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinCorteAnteriorMonitoreo;
    protected Integer mes1Antes;
    protected Integer mes2Antes;
    protected Integer mesFechaCancelacion;
    protected Integer mesMonitoreoActual;
    protected Integer mesMonitoreoAnterior;
    protected MonitoreoMensualODMVO monitoreoMensualMes1;
    protected MonitoreoMensualODMVO monitoreoMensualMes2;
    protected MonitoreoMensualODMVO monitoreoMensualMes3;
    protected Integer numTrimestreSigAnualidad;
    protected Boolean tieneCuentaCaptacionBxI;

    /**
     * Obtiene el valor de la propiedad claveDefinitiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveDefinitiva() {
        return claveDefinitiva;
    }

    /**
     * Define el valor de la propiedad claveDefinitiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveDefinitiva(String value) {
        this.claveDefinitiva = value;
    }

    /**
     * Obtiene el valor de la propiedad claveEmpaquetamiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveEmpaquetamiento() {
        return claveEmpaquetamiento;
    }

    /**
     * Define el valor de la propiedad claveEmpaquetamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveEmpaquetamiento(String value) {
        this.claveEmpaquetamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad clavePagosBxI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavePagosBxI() {
        return clavePagosBxI;
    }

    /**
     * Define el valor de la propiedad clavePagosBxI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavePagosBxI(String value) {
        this.clavePagosBxI = value;
    }

    /**
     * Obtiene el valor de la propiedad clavePagosVencidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavePagosVencidos() {
        return clavePagosVencidos;
    }

    /**
     * Define el valor de la propiedad clavePagosVencidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavePagosVencidos(String value) {
        this.clavePagosVencidos = value;
    }

    /**
     * Obtiene el valor de la propiedad clavePenalizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClavePenalizacion() {
        return clavePenalizacion;
    }

    /**
     * Define el valor de la propiedad clavePenalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClavePenalizacion(String value) {
        this.clavePenalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claveTransacciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveTransacciones() {
        return claveTransacciones;
    }

    /**
     * Define el valor de la propiedad claveTransacciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveTransacciones(String value) {
        this.claveTransacciones = value;
    }

    /**
     * Obtiene el valor de la propiedad contractDetails.
     * 
     * @return
     *     possible object is
     *     {@link ContractDetailsODMVO }
     *     
     */
    public ContractDetailsODMVO getContractDetails() {
        return contractDetails;
    }

    /**
     * Define el valor de la propiedad contractDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDetailsODMVO }
     *     
     */
    public void setContractDetails(ContractDetailsODMVO value) {
        this.contractDetails = value;
    }

    /**
     * Gets the value of the contractDetailsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractDetailsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractDetailsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractDetailsODMVO }
     * 
     * 
     */
    public List<ContractDetailsODMVO> getContractDetailsList() {
        if (contractDetailsList == null) {
            contractDetailsList = new ArrayList<ContractDetailsODMVO>();
        }
        return this.contractDetailsList;
    }

    /**
     * Obtiene el valor de la propiedad cumpleCondiciones.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCumpleCondiciones() {
        return cumpleCondiciones;
    }

    /**
     * Define el valor de la propiedad cumpleCondiciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCumpleCondiciones(Boolean value) {
        this.cumpleCondiciones = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionError(String value) {
        this.descripcionError = value;
    }

    /**
     * Obtiene el valor de la propiedad esBaja.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsBaja() {
        return esBaja;
    }

    /**
     * Define el valor de la propiedad esBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsBaja(Boolean value) {
        this.esBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad esCuentaActiva.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsCuentaActiva() {
        return esCuentaActiva;
    }

    /**
     * Define el valor de la propiedad esCuentaActiva.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsCuentaActiva(Boolean value) {
        this.esCuentaActiva = value;
    }

    /**
     * Obtiene el valor de la propiedad estaEnUltimos3Meses.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstaEnUltimos3Meses() {
        return estaEnUltimos3Meses;
    }

    /**
     * Define el valor de la propiedad estaEnUltimos3Meses.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstaEnUltimos3Meses(Boolean value) {
        this.estaEnUltimos3Meses = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCancelacion() {
        return fechaCancelacion;
    }

    /**
     * Define el valor de la propiedad fechaCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCancelacion(XMLGregorianCalendar value) {
        this.fechaCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinCorteAnteriorMonitoreo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinCorteAnteriorMonitoreo() {
        return fechaFinCorteAnteriorMonitoreo;
    }

    /**
     * Define el valor de la propiedad fechaFinCorteAnteriorMonitoreo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinCorteAnteriorMonitoreo(XMLGregorianCalendar value) {
        this.fechaFinCorteAnteriorMonitoreo = value;
    }

    /**
     * Obtiene el valor de la propiedad mes1Antes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMes1Antes() {
        return mes1Antes;
    }

    /**
     * Define el valor de la propiedad mes1Antes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMes1Antes(Integer value) {
        this.mes1Antes = value;
    }

    /**
     * Obtiene el valor de la propiedad mes2Antes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMes2Antes() {
        return mes2Antes;
    }

    /**
     * Define el valor de la propiedad mes2Antes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMes2Antes(Integer value) {
        this.mes2Antes = value;
    }

    /**
     * Obtiene el valor de la propiedad mesFechaCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesFechaCancelacion() {
        return mesFechaCancelacion;
    }

    /**
     * Define el valor de la propiedad mesFechaCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesFechaCancelacion(Integer value) {
        this.mesFechaCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad mesMonitoreoActual.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesMonitoreoActual() {
        return mesMonitoreoActual;
    }

    /**
     * Define el valor de la propiedad mesMonitoreoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesMonitoreoActual(Integer value) {
        this.mesMonitoreoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad mesMonitoreoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesMonitoreoAnterior() {
        return mesMonitoreoAnterior;
    }

    /**
     * Define el valor de la propiedad mesMonitoreoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesMonitoreoAnterior(Integer value) {
        this.mesMonitoreoAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad monitoreoMensualMes1.
     * 
     * @return
     *     possible object is
     *     {@link MonitoreoMensualODMVO }
     *     
     */
    public MonitoreoMensualODMVO getMonitoreoMensualMes1() {
        return monitoreoMensualMes1;
    }

    /**
     * Define el valor de la propiedad monitoreoMensualMes1.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoreoMensualODMVO }
     *     
     */
    public void setMonitoreoMensualMes1(MonitoreoMensualODMVO value) {
        this.monitoreoMensualMes1 = value;
    }

    /**
     * Obtiene el valor de la propiedad monitoreoMensualMes2.
     * 
     * @return
     *     possible object is
     *     {@link MonitoreoMensualODMVO }
     *     
     */
    public MonitoreoMensualODMVO getMonitoreoMensualMes2() {
        return monitoreoMensualMes2;
    }

    /**
     * Define el valor de la propiedad monitoreoMensualMes2.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoreoMensualODMVO }
     *     
     */
    public void setMonitoreoMensualMes2(MonitoreoMensualODMVO value) {
        this.monitoreoMensualMes2 = value;
    }

    /**
     * Obtiene el valor de la propiedad monitoreoMensualMes3.
     * 
     * @return
     *     possible object is
     *     {@link MonitoreoMensualODMVO }
     *     
     */
    public MonitoreoMensualODMVO getMonitoreoMensualMes3() {
        return monitoreoMensualMes3;
    }

    /**
     * Define el valor de la propiedad monitoreoMensualMes3.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoreoMensualODMVO }
     *     
     */
    public void setMonitoreoMensualMes3(MonitoreoMensualODMVO value) {
        this.monitoreoMensualMes3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numTrimestreSigAnualidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumTrimestreSigAnualidad() {
        return numTrimestreSigAnualidad;
    }

    /**
     * Define el valor de la propiedad numTrimestreSigAnualidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumTrimestreSigAnualidad(Integer value) {
        this.numTrimestreSigAnualidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneCuentaCaptacionBxI.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTieneCuentaCaptacionBxI() {
        return tieneCuentaCaptacionBxI;
    }

    /**
     * Define el valor de la propiedad tieneCuentaCaptacionBxI.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTieneCuentaCaptacionBxI(Boolean value) {
        this.tieneCuentaCaptacionBxI = value;
    }

	@Override
	public String toString() {
		return "Monitoreo123XMi [claveDefinitiva=" + claveDefinitiva + ", claveEmpaquetamiento=" + claveEmpaquetamiento
				+ ", clavePagosBxI=" + clavePagosBxI + ", clavePagosVencidos=" + clavePagosVencidos
				+ ", clavePenalizacion=" + clavePenalizacion + ", claveTransacciones=" + claveTransacciones
				+ ", contractDetails=" + contractDetails + ", contractDetailsList=" + contractDetailsList
				+ ", cumpleCondiciones=" + cumpleCondiciones + ", descripcionError=" + descripcionError + ", esBaja="
				+ esBaja + ", esCuentaActiva=" + esCuentaActiva + ", estaEnUltimos3Meses=" + estaEnUltimos3Meses
				+ ", fechaCancelacion=" + fechaCancelacion + ", fechaFinCorteAnteriorMonitoreo="
				+ fechaFinCorteAnteriorMonitoreo + ", mes1Antes=" + mes1Antes + ", mes2Antes=" + mes2Antes
				+ ", mesFechaCancelacion=" + mesFechaCancelacion + ", mesMonitoreoActual=" + mesMonitoreoActual
				+ ", mesMonitoreoAnterior=" + mesMonitoreoAnterior + ", monitoreoMensualMes1=" + monitoreoMensualMes1
				+ ", monitoreoMensualMes2=" + monitoreoMensualMes2 + ", monitoreoMensualMes3=" + monitoreoMensualMes3
				+ ", numTrimestreSigAnualidad=" + numTrimestreSigAnualidad + ", tieneCuentaCaptacionBxI="
				+ tieneCuentaCaptacionBxI + "]";
	}

    
}
