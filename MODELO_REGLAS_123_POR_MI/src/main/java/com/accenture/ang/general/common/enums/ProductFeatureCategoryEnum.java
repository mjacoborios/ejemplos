/**********************************************************************************************************************
 * Copyright Â© 2010 - 2012, Accenture Software, All Rights Reserved.
 * 
 * Project Name: COMMON_CBO
 * 
 * Description: com contains Objects like CBO, Enumerations, Identifiers which is not commonly used by other Project.
 * 
 * Application: Common
 * 
 * Company: Accenture
 * 
 * The trademarks used in these materials are the properties of their respective owners. This work is protected by
 * copyright law and contains valuable trade secrets and confidential information.
 ********************************************************************************************************************** 
 */
package com.accenture.ang.general.common.enums;

/**
 * A Enum representation of the ProductFeatureCategoryEnum object model.
 * 
 * @generated
 */
public enum ProductFeatureCategoryEnum {

    /**
     * The Administration literal.
     * 
     * @generated
     */
    ADMINISTRATION("Administration", "3"), 
    
    /**
     * The Alerts literal.
     * 
     * @generated
     */
    ALERTS("Alerts", "4"),
    
    /**
     * The General literal.
     * 
     * @generated
     */
    GENERAL("General", "1"),

    /**
     * The Operational literal.
     * 
     * @generated
     */
    OPERATIVE("Operational", "2"), 
    
    /**
     * The Regulatory literal.
     * 
     * @generated
     */
    REGULATORY("Regulatory", "5");

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
    private ProductFeatureCategoryEnum(String inputDescription, String inputCode) {
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
    public static ProductFeatureCategoryEnum getEnumFromCode(String code) {
        for (int i = 0; i < ProductFeatureCategoryEnum.values().length; i++) {
            if (ProductFeatureCategoryEnum.values()[i].getCode().equals(code)) {
                return ProductFeatureCategoryEnum.values()[i];
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
    public static ProductFeatureCategoryEnum getEnumFromDescription(String description) {
        for (int i = 0; i < ProductFeatureCategoryEnum.values().length; i++) {
            if (ProductFeatureCategoryEnum.values()[i].getDescription().equals(description)) {
                return ProductFeatureCategoryEnum.values()[i];
            }
        }
        return null;
    }
}
