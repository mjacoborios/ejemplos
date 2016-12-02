/**********************************************************************************************************************
 * Copyright Â© 2010 - 2013, Accenture Software, All Rights Reserved.
 * 
 * Project Name: PF_FACTORY_INTEGRATION
 * 
 * Description: pff Integration project contains all data exchanged between presentation layer and business hub (value
 * objects, identifiers, enums, etc.) of pff application.
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
 * A Enum representation of the OutputFormatEnum object model.
 * 
 * @generated
 */
public enum OutputFormatEnum {

    /**
     * The LIST literal.
     * 
     * @generated
     */
    LIST("LIST", "LIS"),

    /**
     * The FOLDER literal.
     * 
     * @generated
     */
    FOLDER("FOLDER", "FOL"),

    /**
     * The CUSTOMER literal.
     * 
     * @generated
     */
    CUSTOMER("CUSTOMER", "CUS");

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
    private OutputFormatEnum(String inputDescription, String inputCode) {
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
    public static OutputFormatEnum getEnumFromCode(String code) {
        for (int i = 0; i < OutputFormatEnum.values().length; i++) {
            if (OutputFormatEnum.values()[i].getCode().equals(code)) {
                return OutputFormatEnum.values()[i];
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
    public static OutputFormatEnum getEnumFromDescription(String description) {
        for (int i = 0; i < OutputFormatEnum.values().length; i++) {
            if (OutputFormatEnum.values()[i].getDescription().equals(description)) {
                return OutputFormatEnum.values()[i];
            }
        }
        return null;
    }
}
