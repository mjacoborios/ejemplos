/**********************************************************************************************************************
 * Copyright Â© 2010 - 2012, Accenture Software, All Rights Reserved.
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
 * A Enum representation of the OfferingProductRelationshipTypeEnum object model.
 * 
 * @generated
 */
public enum OfferingProductRelationshipTypeEnum {

    /**
     * The Mandatory literal.
     * 
     * @generated
     */
    MANDATORY("Mandatory", "M"),

    /**
     * The Optional literal.
     * 
     * @generated
     */
    OPTIONAL("Optional", "O"),

    /**
     * The Alternative (Group 1) literal.
     * 
     * @generated
     */
    ALTERNATIVE__GROUP_1_("Alternative (Group 1)", "G1"),

    /**
     * The Alternative (Group 2) literal.
     * 
     * @generated
     */
    ALTERNATIVE__GROUP_2_("Alternative (Group 2)", "G2"),

    /**
     * The Alternative (Group 3) literal.
     * 
     * @generated
     */
    ALTERNATIVE__GROUP_3_("Alternative (Group 3)", "G3"),

    /**
     * The Alternative (Group 4) literal.
     * 
     * @generated
     */
    ALTERNATIVE__GROUP_4_("Alternative (Group 4)", "G4"),

    /**
     * The Alternative (Group 5) literal.
     * 
     * @generated
     */
    ALTERNATIVE__GROUP_5_("Alternative (Group 5)", "G5");

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
    private OfferingProductRelationshipTypeEnum(String inputDescription, String inputCode) {
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
    public static OfferingProductRelationshipTypeEnum getEnumFromCode(String code) {
        for (int i = 0; i < OfferingProductRelationshipTypeEnum.values().length; i++) {
            if (OfferingProductRelationshipTypeEnum.values()[i].getCode().equals(code)) {
                return OfferingProductRelationshipTypeEnum.values()[i];
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
    public static OfferingProductRelationshipTypeEnum getEnumFromDescription(String description) {
        for (int i = 0; i < OfferingProductRelationshipTypeEnum.values().length; i++) {
            if (OfferingProductRelationshipTypeEnum.values()[i].getDescription().equals(description)) {
                return OfferingProductRelationshipTypeEnum.values()[i];
            }
        }
        return null;
    }
}
