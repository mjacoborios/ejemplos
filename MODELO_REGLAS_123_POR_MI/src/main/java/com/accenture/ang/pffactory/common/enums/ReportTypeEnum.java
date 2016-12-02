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
 * It stores the different report types availables..
 * 
 * @generated
 */
public enum ReportTypeEnum {

    /**
     * The Result Summary literal.
     * 
     * @generated
     */
    RESULT_SUMMARY("Result Summary", "RSM"),

    /**
     * The Aggregated Prices literal.
     * 
     * @generated
     */
    AGGREGATED_PRICES("Aggregated Prices", "AGP"),

    /**
     * The Prices Assigned literal.
     * 
     * @generated
     */
    PRICES_ASSIGNED("Prices Assigned", "PAS");

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
    private ReportTypeEnum(String inputDescription, String inputCode) {
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
    public static ReportTypeEnum getEnumFromCode(String code) {
        for (int i = 0; i < ReportTypeEnum.values().length; i++) {
            if (ReportTypeEnum.values()[i].getCode().equals(code)) {
                return ReportTypeEnum.values()[i];
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
    public static ReportTypeEnum getEnumFromDescription(String description) {
        for (int i = 0; i < ReportTypeEnum.values().length; i++) {
            if (ReportTypeEnum.values()[i].getDescription().equals(description)) {
                return ReportTypeEnum.values()[i];
            }
        }
        return null;
    }
}
