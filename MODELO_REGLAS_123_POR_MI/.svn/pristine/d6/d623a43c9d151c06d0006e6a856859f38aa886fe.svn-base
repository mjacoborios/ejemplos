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
package com.accenture.ang.customerinformation.common.enums;


/**
 * Enumeration for the type of a customer.
 * 
 * @generated
 */
public enum PartyTypeEnum {

    /**
     * The Personal literal.
     * 
     * @generated
     */
    PERSONAL("Personal", "0"),

    /**
     * The Commercial literal.
     * 
     * @generated
     */
    COMMERCIAL("Commercial", "1");

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
     * @param inputDescription
     *            description to set
     * @param inputCode
     *            code to set
     * 
     * @generated
     */
    private PartyTypeEnum(String inputDescription, String inputCode) {
        this.description = inputDescription;
        this.code = inputCode;
    }

    /**
     * Gets the enum from code.
     * 
     * @param code
     *            the code
     * 
     * @return the enum from code
     * 
     * @generated
     */
    public static PartyTypeEnum getEnumFromCode(String code) {
        for (int i = 0; i < PartyTypeEnum.values().length; i++) {
            if (PartyTypeEnum.values()[i].getCode().equals(code)) {
                return PartyTypeEnum.values()[i];
            }
        }
        return null;
    }

    /**
     * Gets the enum from description.
     * 
     * @param description
     *            the description
     * 
     * @return the enum from description
     * 
     * @generated
     */
    public static PartyTypeEnum getEnumFromDescription(String description) {
        for (int i = 0; i < PartyTypeEnum.values().length; i++) {
            if (PartyTypeEnum.values()[i].getDescription().equals(description)) {
                return PartyTypeEnum.values()[i];
            }
        }
        return null;
    }
}

