/**********************************************************************************************************************
 * Copyright Â© 2010 - 2016, Accenture Software, All Rights Reserved.
 * 
 * Project Name:    PF_FACTORY_INTEGRATION
 *
 * Description:     pff Integration project contains all data exchanged between 
 *                  presentation layer and business hub (value objects, identifiers, enums, etc.) 
 *                  of pff application. 
 *
 * Application:     Product and Fee Factory
 * 
 * Company:         Accenture 
 * 
 * The trademarks used in these materials are the properties of their respective owners.
 * This work is protected by copyright law and contains valuable trade secrets and confidential information.
 **********************************************************************************************************************
 */
package com.accenture.ang.pffactory.referencial.entity.odm;

import java.io.Serializable;

/**
 * A Class representation of the ContractDetailsODMVO model object.
 * 
 * @generated
 */
public class ContractDetailsODMVO implements Serializable {

	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Member variable for Prime Number Hashcode.
	 */
	private static final int PRIME_NUMBER_HASHCODE = 31;

	/**
	 * In Product&Fee Factory, a product is composed of items (product
	 * characteristics). For an item of type 'Simple' (String, Decimal, Integer,
	 * Percentage), this property is the value assigned to the item..
	 * 
	 * @generated
	 */
	private String accountStatusCode;

	/**
	 * In Product&Fee Factory, a product is composed of items (product
	 * characteristics). For an item of type 'Simple' (String, Decimal, Integer,
	 * Percentage), this property is the value assigned to the item..
	 * 
	 * @generated
	 */
	private String familyProduct;

	/**
	 * Retrieves the accountStatusCode.
	 * 
	 * @return In Product&Fee Factory, a product is composed of items (product
	 *         characteristics). For an item of type 'Simple' (String, Decimal,
	 *         Integer, Percentage), this property is the value assigned to the
	 *         item..
	 * 
	 * @generated
	 */
	public String getAccountStatusCode() {
		/* Begin: Custom Code */
		return this.accountStatusCode;
		/* End: Custom Code */
	}

	/**
	 * Sets the accountStatusCode.
	 * 
	 * @param accountStatusCode
	 *            In Product&Fee Factory, a product is composed of items
	 *            (product characteristics). For an item of type 'Simple'
	 *            (String, Decimal, Integer, Percentage), this property is the
	 *            value assigned to the item..
	 * 
	 * @generated
	 */
	public void setAccountStatusCode(String accountStatusCode) {
		this.accountStatusCode = accountStatusCode;
		/* Begin: Custom Code */
		/* End: Custom Code */
	}

	/**
	 * Retrieves the familyProduct.
	 * 
	 * @return In Product&Fee Factory, a product is composed of items (product
	 *         characteristics). For an item of type 'Simple' (String, Decimal,
	 *         Integer, Percentage), this property is the value assigned to the
	 *         item..
	 * 
	 * @generated
	 */
	public String getFamilyProduct() {
		/* Begin: Custom Code */
		return this.familyProduct;
		/* End: Custom Code */
	}

	/**
	 * Sets the familyProduct.
	 * 
	 * @param familyProduct
	 *            In Product&Fee Factory, a product is composed of items
	 *            (product characteristics). For an item of type 'Simple'
	 *            (String, Decimal, Integer, Percentage), this property is the
	 *            value assigned to the item..
	 * 
	 * @generated
	 */
	public void setFamilyProduct(String familyProduct) {
		this.familyProduct = familyProduct;
		/* Begin: Custom Code */
		/* End: Custom Code */
	}

	/**
	 * Method to generate hash code value of each attribute.
	 * 
	 * @return a hash code value for this object.
	 * 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;
		result = ContractDetailsODMVO.PRIME_NUMBER_HASHCODE
				* result
				+ ((this.accountStatusCode == null) ? 0
						: this.accountStatusCode.hashCode());
		result = ContractDetailsODMVO.PRIME_NUMBER_HASHCODE
				* result
				+ ((this.familyProduct == null) ? 0 : this.familyProduct
						.hashCode());
		/* Begin: Custom Code */
		/* End: Custom Code */
		return result;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare.
	 * @return true if this object is the same as the obj argument; false
	 *         otherwise.
	 * 
	 * @generated
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ContractDetailsODMVO other = (ContractDetailsODMVO) obj;
		if (this.accountStatusCode == null) {
			if (other.accountStatusCode != null) {
				return false;
			}
		} else if (!this.accountStatusCode.equals(other.accountStatusCode)) {
			return false;
		}
		if (this.familyProduct == null) {
			if (other.familyProduct != null) {
				return false;
			}
		} else if (!this.familyProduct.equals(other.familyProduct)) {
			return false;
		}
		/* Begin: Custom Code */
		/* End: Custom Code */
		return true;
	}
}

