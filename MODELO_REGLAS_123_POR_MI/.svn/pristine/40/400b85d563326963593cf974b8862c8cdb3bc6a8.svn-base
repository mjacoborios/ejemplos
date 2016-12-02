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
 * <p> The possible status of a&nbsp;basic product feature will be: </p> <p> Not Complete: the basic product feature is
 * being modified and has not passed the validations by category </p> <p> Complete: the Basic Product Feature has passed
 * the validations by Category </p> <p> Ready to Use: the Basic Product Feature has passed the validations to activate
 * (ready to use)&nbsp;the basic product </p>.
 * 
 * @generated
 */
public enum CompletionBPFeatureEnum {

    /**
     * The Ready To Use literal.
     * 
     * @generated
     */
    READY_TO_USE("Ready To Use", "R"),

    /**
     * The Complete literal.
     * 
     * @generated
     */
    COMPLETE("Complete", "C"),

    /**
     * The Not Complete literal.
     * 
     * @generated
     */
    NOT_COMPLETE("Not Complete", "N"),
     /**
      * The Versioned literal.
      * 
      * @generated
      */
     VERSIONED("Versioned", "V");

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
    private CompletionBPFeatureEnum(String inputDescription, String inputCode) {
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
    public static CompletionBPFeatureEnum getEnumFromCode(String code) {
        for (int i = 0; i < CompletionBPFeatureEnum.values().length; i++) {
            if (CompletionBPFeatureEnum.values()[i].getCode().equals(code)) {
                return CompletionBPFeatureEnum.values()[i];
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
    public static CompletionBPFeatureEnum getEnumFromDescription(String description) {
        for (int i = 0; i < CompletionBPFeatureEnum.values().length; i++) {
            if (CompletionBPFeatureEnum.values()[i].getDescription().equals(description)) {
                return CompletionBPFeatureEnum.values()[i];
            }
        }
        return null;
    }
}
