/**********************************************************************************************************************
 * Copyright Ã‚Â© 2010 - 2013, Accenture Software, All Rights Reserved.
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
 * A Enum representation of the ContractStatusEnum object model.
 * 
 * @generated
 */
public enum ContractStatusEnum {

    /**
     * The Active literal.
     * 
     * @generated
     */
    ACTIVE("Active", "A"),

    /**
     * The Precancelled literal.
     * 
     * @generated
     */
    PRECANCELLED("Precancelled", "P"),

    /**
     * The CancelledRenewed literal.
     * 
     * @generated
     */
    CANCELLEDRENEWED("CancelledRenewed", "CR"),

    /**
     * The Cancelled literal.
     * 
     * @generated
     */
    CANCELLED("Cancelled", "C");

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
    private ContractStatusEnum(String inputDescription, String inputCode) {
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
    public static ContractStatusEnum getEnumFromCode(String code) {
        for (int i = 0; i < ContractStatusEnum.values().length; i++) {
            if (ContractStatusEnum.values()[i].getCode().equals(code)) {
                return ContractStatusEnum.values()[i];
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
    public static ContractStatusEnum getEnumFromDescription(String description) {
        for (int i = 0; i < ContractStatusEnum.values().length; i++) {
            if (ContractStatusEnum.values()[i].getDescription().equals(description)) {
                return ContractStatusEnum.values()[i];
            }
        }
        return null;
    }
}
