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
 * A Enum representation of the InitiativeStatusEnum object model.
 * 
 * @generated
 */
public enum InitiativeStatusEnum {

    /**
     * The Created literal.
     * 
     * @generated
     */
    CREATED("Created", "CRE"),

    /**
     * The Pending Calculation literal.
     * 
     * @generated
     */
    PENDING_CALCULATION("Pending Calculation", "PCA"),

    /**
     * The Calculated literal.
     * 
     * @generated
     */
    CALCULATED("Calculated", "CAL"),

    /**
     * The Confirmed literal.
     * 
     * @generated
     */
    CONFIRMED("Confirmed", "CON"),

    /**
     * The Executed literal.
     * 
     * @generated
     */
    EXECUTED("Executed", "EXE"),

    /**
     * The Cancelled literal.
     * 
     * @generated
     */
    CANCELLED("Cancelled", "CAN"),

    /**
     * The Erroneous literal.
     * 
     * @generated
     */
    ERRONEOUS("Erroneous", "ERR");

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
    private InitiativeStatusEnum(String inputDescription, String inputCode) {
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
    public static InitiativeStatusEnum getEnumFromCode(String code) {
        for (int i = 0; i < InitiativeStatusEnum.values().length; i++) {
            if (InitiativeStatusEnum.values()[i].getCode().equals(code)) {
                return InitiativeStatusEnum.values()[i];
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
    public static InitiativeStatusEnum getEnumFromDescription(String description) {
        for (int i = 0; i < InitiativeStatusEnum.values().length; i++) {
            if (InitiativeStatusEnum.values()[i].getDescription().equals(description)) {
                return InitiativeStatusEnum.values()[i];
            }
        }
        return null;
    }
}
