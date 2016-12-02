/**********************************************************************************************************************
 * Copyright Â© 2010 - 2013, Accenture Software, All Rights Reserved.
 * 
 * Project Name:    COMMON_INTERFACES
 *
 * Description:     com contains Enumerations, ValueObject, Identifiers and CoarseGrained
 * 					which are use conceptually.
 *
 * Application:     Common
 * 
 * Company:         Accenture 
 * 
 * The trademarks used in these materials are the properties of their respective owners.
 * This work is protected by copyright law and contains valuable trade secrets and confidential information.
 **********************************************************************************************************************
 */
package com.accenture.ang.pffactory.common.enums;


/**
 * Specific operators used in pricing engine. It has one more (space) to have the option to not fill it.
 * 
 * @generated
 */
public enum PricingOperatorEnum {

	/**
	 * The Divide literal.
	 * 
	 * @generated
	 */
	DIVIDE("Divide", "/"),

	/**
	 * The Multiply literal.
	 * 
	 * @generated
	 */
	MULTIPLY("Multiply", "*"),

	/**
	 * The Minus literal.
	 * 
	 * @generated
	 */
	MINUS("Minus", "-"),

	/**
	 * The Plus literal.
	 * 
	 * @generated
	 */
	PLUS("Plus", "+");

	/**
	 * The description of the enumeration.
	 * 
	 * @generated
	 */
	private String description;

	/**
	 * The code of the enumeration.
	 * 
	 * @generated
	 */
	private String code;

	/**
	 * Retrieves the Description.
	 * 
	 * @return the description
	 * 
	 * @generated
	 */
	public String getDescription() {
		/* Begin: Custom Code */
		return this.description;
		/* End: Custom Code */
	}

	/**
	 * Retrieves the Code.
	 * 
	 * @return the code
	 * 
	 * @generated
	 */
	public String getCode() {
		/* Begin: Custom Code */
		return this.code;
		/* End: Custom Code */
	}

	/**
	 * Sets the name and the value.
	 * 
	 * @param inputDescription description to set
	 * @param inputCode code to set
	 * 
	 * @generated
	 */
	private PricingOperatorEnum(String inputDescription, String inputCode) {
		this.description = inputDescription;
		this.code = inputCode;
	}

	/**
	 * Gets the enum from code.
	 * 
	 * @param code the code
	 * 
	 * @return the enum from code
	 * 
	 * @generated
	 */
	public static PricingOperatorEnum getEnumFromCode(String code) {
		for (int i = 0; i < PricingOperatorEnum.values().length; i++) {
			if (PricingOperatorEnum.values()[i].getCode().equals(code)) {
				return PricingOperatorEnum.values()[i];
			}
		}
		return null;
	}

	/**
	 * Gets the enum from description.
	 * 
	 * @param description the description
	 * 
	 * @return the enum from description
	 * 
	 * @generated
	 */
	public static PricingOperatorEnum getEnumFromDescription(String description) {
		for (int i = 0; i < PricingOperatorEnum.values().length; i++) {
			if (PricingOperatorEnum.values()[i].getDescription().equals(description)) {
				return PricingOperatorEnum.values()[i];
			}
		}
		return null;
	}
}

