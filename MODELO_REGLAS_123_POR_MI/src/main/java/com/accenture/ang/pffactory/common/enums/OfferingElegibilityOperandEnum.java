/**********************************************************************************************************************
 * Copyright © 2010 - 2012, Accenture Software, All Rights Reserved.
 * 
 * Project Name: PF_FACTORY_INTEGRATION
 * 
 * Description: PFF Integration project contains all data exchanged between presentation layer and business hub (value
 * objects, identifiers, enums, etc.) of PFF application.
 * 
 * Application: Product and Fee Factory
 * 
 * Company: Accenture
 * 
 * The trademarks used in these materials are the properties of their respective owners. This work is protected by
 * copyright law and contains valuable trade secrets and confidential information.
 ********************************************************************************************************************** 
 */
package com.accenture.ang.pffactory.common.enums;

/**
 * A Enum representation of the OfferingElegibilityOperandEnum object model.
 * 
 * @generated
 */
public enum OfferingElegibilityOperandEnum {

    /**
     * The And literal.
     * 
     * @generated
     */
    AND("And", "+"),

    /**
     * The Or literal.
     * 
     * @generated
     */
    OR("Or", "-"),

    /**
     * The Greater than literal.
     * 
     * @generated
     */
    GREATER_THAN("Greater than", ">"),

    /**
     * The Less than literal.
     * 
     * @generated
     */
    LESS_THAN("Less than", "<"),

    /**
     * The Equal literal.
     * 
     * @generated
     */
    EQUAL("Equal", "="),

    /**
     * The Not less literal.
     * 
     * @generated
     */
    NOT_LESS("Not less", ">="),

    /**
     * The Not greater literal.
     * 
     * @generated
     */
    NOT_GREATER("Not greater", "=<");

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
    private OfferingElegibilityOperandEnum(String inputDescription, String inputCode) {
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
    public static OfferingElegibilityOperandEnum getEnumFromCode(String code) {
        for (int i = 0; i < OfferingElegibilityOperandEnum.values().length; i++) {
            if (OfferingElegibilityOperandEnum.values()[i].getCode().equals(code)) {
                return OfferingElegibilityOperandEnum.values()[i];
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
    public static OfferingElegibilityOperandEnum getEnumFromDescription(String description) {
        for (int i = 0; i < OfferingElegibilityOperandEnum.values().length; i++) {
            if (OfferingElegibilityOperandEnum.values()[i].getDescription().equals(description)) {
                return OfferingElegibilityOperandEnum.values()[i];
            }
        }
        return null;
    }
}
