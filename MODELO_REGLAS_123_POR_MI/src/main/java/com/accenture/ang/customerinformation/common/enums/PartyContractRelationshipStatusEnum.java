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
 * Status for partyContractRelationship .
 * 
 * @generated
 */
public enum PartyContractRelationshipStatusEnum {

    /**
     * The Active literal.
     * 
     * @generated
     */
    ACTIVE("Active", "A"),

    /**
     * The Annuled literal.
     * 
     * @generated
     */
    ANNULED("Annuled", "N"),

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
    private PartyContractRelationshipStatusEnum(String inputDescription, String inputCode) {
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
    public static PartyContractRelationshipStatusEnum getEnumFromCode(String code) {
        for (int i = 0; i < PartyContractRelationshipStatusEnum.values().length; i++) {
            if (PartyContractRelationshipStatusEnum.values()[i].getCode().equals(code)) {
                return PartyContractRelationshipStatusEnum.values()[i];
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
    public static PartyContractRelationshipStatusEnum getEnumFromDescription(String description) {
        for (int i = 0; i < PartyContractRelationshipStatusEnum.values().length; i++) {
            if (PartyContractRelationshipStatusEnum.values()[i].getDescription().equals(description)) {
                return PartyContractRelationshipStatusEnum.values()[i];
            }
        }
        return null;
    }
}

