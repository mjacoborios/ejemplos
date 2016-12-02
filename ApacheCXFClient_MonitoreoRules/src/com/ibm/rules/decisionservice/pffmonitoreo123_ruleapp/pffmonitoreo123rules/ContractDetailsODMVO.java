
package com.ibm.rules.decisionservice.pffmonitoreo123_ruleapp.pffmonitoreo123rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contractDetailsODMVO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contractDetailsODMVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractDetailsODMVO", propOrder = {
    "accountStatusCode",
    "familyProduct"
})
public class ContractDetailsODMVO {

    protected String accountStatusCode;
    protected String familyProduct;

    /**
     * Obtiene el valor de la propiedad accountStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatusCode() {
        return accountStatusCode;
    }

    /**
     * Define el valor de la propiedad accountStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatusCode(String value) {
        this.accountStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad familyProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyProduct() {
        return familyProduct;
    }

    /**
     * Define el valor de la propiedad familyProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyProduct(String value) {
        this.familyProduct = value;
    }

}
