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
 * A Enum representation of the InterestVariationTypeEnum object model.
 * 
 * @generated
 */
public enum InterestVariationTypeEnum {

	/**
	 * The Increase(Unit) literal.
	 * 
	 * @generated
	 */
	INCREASE_UNIT_("Increase(Unit)", "IU"),

	/**
	 * The Reduce(Unit) literal.
	 * 
	 * @generated
	 */
	REDUCE_UNIT_("Reduce(Unit)", "RU"),

	/**
	 * The Increase(%) literal.
	 * 
	 * @generated
	 */
	INCREASE___("Increase(%)", "IP"),

	/**
	 * The Reduce(%) literal.
	 * 
	 * @generated
	 */
	REDUCE___("Reduce(%)", "RP");

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
	private InterestVariationTypeEnum(String inputDescription, String inputCode) {
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
	public static InterestVariationTypeEnum getEnumFromCode(String code) {
		for (int i = 0; i < InterestVariationTypeEnum.values().length; i++) {
			if (InterestVariationTypeEnum.values()[i].getCode().equals(code)) {
				return InterestVariationTypeEnum.values()[i];
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
	public static InterestVariationTypeEnum getEnumFromDescription(String description) {
		for (int i = 0; i < InterestVariationTypeEnum.values().length; i++) {
			if (InterestVariationTypeEnum.values()[i].getDescription().equals(description)) {
				return InterestVariationTypeEnum.values()[i];
			}
		}
		return null;
	}
}

