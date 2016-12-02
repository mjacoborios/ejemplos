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
 * The possible status of an basic product will be: Ready To Use: The Basic Product can be offered. Catalog application
 * can showed it. Not Ready To Use: The Basic Product can not be offered. Catalog application can not show it. In
 * Progress: the Basic Product is being defined. Never has been RTU Cancelled: the Basic Product is canceled and can not
 * be used anymore..
 * 
 * @generated
 */
public enum BasicProductStatusEnum {

    /**
     * The Not ready to use literal.
     * 
     * @generated
     */
    NOT_READY_TO_USE("Not ready to use", "0"),

    /**
     * The Ready to use literal.
     * 
     * @generated
     */
    READY_TO_USE("Ready to use", "1"),

    /**
     * The In Progress literal.
     * 
     * @generated
     */
    IN_PROGRESS("In Progress", "2"),

    /**
     * The Cancelled literal.
     * 
     * @generated
     */
    CANCELLED("Cancelled", "3");

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
    private BasicProductStatusEnum(String inputDescription, String inputCode) {
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
    public static BasicProductStatusEnum getEnumFromCode(String code) {
        for (int i = 0; i < BasicProductStatusEnum.values().length; i++) {
            if (BasicProductStatusEnum.values()[i].getCode().equals(code)) {
                return BasicProductStatusEnum.values()[i];
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
    public static BasicProductStatusEnum getEnumFromDescription(String description) {
        for (int i = 0; i < BasicProductStatusEnum.values().length; i++) {
            if (BasicProductStatusEnum.values()[i].getDescription().equals(description)) {
                return BasicProductStatusEnum.values()[i];
            }
        }
        return null;
    }
}
