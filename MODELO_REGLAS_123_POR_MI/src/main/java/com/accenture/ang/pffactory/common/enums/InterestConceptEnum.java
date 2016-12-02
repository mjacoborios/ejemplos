/**********************************************************************************************************************
 * Copyright Â© 2010 - 2013, Accenture Software, All Rights Reserved.
 * 
 * Project Name: COMMON_INTERFACES
 * 
 * Description: com contains Enumerations, ValueObject, Identifiers and CoarseGrained which are use conceptually.
 * 
 * Application: Common
 * 
 * Company: Accenture
 * 
 * The trademarks used in these materials are the properties of their respective owners. This work is protected by
 * copyright law and contains valuable trade secrets and confidential information.
 ********************************************************************************************************************** 
 */
package com.accenture.ang.pffactory.common.enums;

/**
 * A Enum representation of the InterestConceptEnum object model.
 * 
 * @generated
 */
public enum InterestConceptEnum {

    /**
     * The Credit Interest literal.
     * 
     * @generated
     */
    CREDIT_INTEREST("Credit Interest", "CRE"),

    /**
     * The Debit Interest literal.
     * 
     * @generated
     */
    DEBIT_INTEREST("Debit Interest", "DEB"),
     /**
      * The Overdraft Interest literal.
      * 
      * @generated
      */
     OVERDRAFT_INTEREST("Overdraft Interest", "OVR"),
     /**
      * The Penalty Interest literal.
      * 
      * @generated
      */
     PENALTY_INTEREST("Penalty Interest", "PEN");

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
    private InterestConceptEnum(String inputDescription, String inputCode) {
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
    public static InterestConceptEnum getEnumFromCode(String code) {
        for (int i = 0; i < InterestConceptEnum.values().length; i++) {
            if (InterestConceptEnum.values()[i].getCode().equals(code)) {
                return InterestConceptEnum.values()[i];
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
    public static InterestConceptEnum getEnumFromDescription(String description) {
        for (int i = 0; i < InterestConceptEnum.values().length; i++) {
            if (InterestConceptEnum.values()[i].getDescription().equals(description)) {
                return InterestConceptEnum.values()[i];
            }
        }
        return null;
    }
}
