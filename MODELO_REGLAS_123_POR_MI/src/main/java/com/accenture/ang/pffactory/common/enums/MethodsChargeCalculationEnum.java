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
 * Different states for a charge calculation..
 * 
 * @generated
 */
public enum MethodsChargeCalculationEnum {

    /**
     * The NoValue literal.
     * 
     * @generated
     */
    NOVALUE("NoValue", "00"),

    /**
     * The FixedOrFloat literal.
     * 
     * @generated
     */
    FIXEDORFLOAT("FixedOrFloat", "01"),

    /**
     * The FixedAndFloat literal.
     * 
     * @generated
     */
    FIXEDANDFLOAT("FixedAndFloat", "02"),

    /**
     * The AverageDualFloat literal.
     * 
     * @generated
     */
    AVERAGEDUALFLOAT("AverageDualFloat", "03"),

    /**
     * The TieredAndSlab literal.
     * 
     * @generated
     */
    TIEREDANDSLAB("TieredAndSlab", "04"),

    /**
     * The OverDraft literal.
     * 
     * @generated
     */
    OVERDRAFT("OverDraft", "05"),

    /**
     * The Custom literal.
     * 
     * @generated
     */
    CUSTOM("Custom", "06"),

    /**
     * The Fixed literal.
     * 
     * @generated
     */
    FIXED("Fixed", "07"),

    /**
     * The Percentage literal.
     * 
     * @generated
     */
    PERCENTAGE("Percentage", "08"),

    /**
     * The FixedSlab literal.
     * 
     * @generated
     */
    FIXEDSLAB("FixedSlab", "09"),

    /**
     * The PercentageSlab literal.
     * 
     * @generated
     */
    PERCENTAGESLAB("PercentageSlab", "10"),

    /**
     * The ComplexSlab literal.
     * 
     * @generated
     */
    COMPLEXSLAB("ComplexSlab", "11"),

    /**
     * The CalculatedByRule literal.
     * 
     * @generated
     */
    CALCULATEDBYRULE("CalculatedByRule", "12"),
     /**
      * The ComplexSlabBundle literal.
      * 
      * @generated
      */
     COMPLEXSLABBUNDLE("ComplexSlabBundle", "13");

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
    private MethodsChargeCalculationEnum(String inputDescription, String inputCode) {
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
    public static MethodsChargeCalculationEnum getEnumFromCode(String code) {
        for (int i = 0; i < MethodsChargeCalculationEnum.values().length; i++) {
            if (MethodsChargeCalculationEnum.values()[i].getCode().equals(code)) {
                return MethodsChargeCalculationEnum.values()[i];
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
    public static MethodsChargeCalculationEnum getEnumFromDescription(String description) {
        for (int i = 0; i < MethodsChargeCalculationEnum.values().length; i++) {
            if (MethodsChargeCalculationEnum.values()[i].getDescription().equals(description)) {
                return MethodsChargeCalculationEnum.values()[i];
            }
        }
        return null;
    }
}
