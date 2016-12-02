/**********************************************************************************************************************
 * Copyright © 2010 - 2012, Accenture Software, All Rights Reserved.
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
 * It indicates the type of units used in the threshold.
 * 
 * @generated
 */
public enum ThresholdTypeEnum {

    /**
     * The Occurrence literal.
     * 
     * @generated
     */
    OCCURRENCE("Occurrence", "01"),

    /**
     * The Amount literal.
     * 
     * @generated
     */
    AMOUNT("Amount", "02"),

    /**
     * The AverageBalance literal.
     * 
     * @generated
     */
    AVERAGEBALANCE("AverageBalance", "03"),
     /**
      * The LimitBalance literal.
      * 
      * @generated
      */
     LIMITBALANCE("LimitBalance", "04"),
     /**
      * The WithDrawnBalance literal.
      * 
      * @generated
      */
     WITHDRAWNBALANCE("WithDrawnBalance", "05"),
     /**
      * The AverageBalanceYear literal.
      * 
      * @generated
      */
     AVERAGEBALANCEYEAR("AverageBalanceYear", "06"),
     /**
      * The WithHoldings literal.
      * 
      * @generated
      */
     WITHHOLDINGS("WithHoldings", "07"),
     /**
      * The ValueBalance literal.
      * 
      * @generated
      */
     VALUEBALANCE("ValueBalance", "08"),
     /**
      * The RequestedCapital literal.
      * 
      * @generated
      */
     REQUESTEDCAPITAL("RequestedCapital", "09"),
     /**
      * The WithDrawnCapital literal.
      * 
      * @generated
      */
     WITHDRAWNCAPITAL("WithDrawnCapital", "10"),
     /**
      * The RealBalance literal.
      * 
      * @generated
      */
     REALBALANCE("RealBalance", "11"),
     /**
      * The CreditLimitCard literal.
      * 
      * @generated
      */
     CREDITLIMITCARD("CreditLimitCard", "12"),
     /**
      * The WithDrawal literal.
      * 
      * @generated
      */
     WITHDRAWAL("WithDrawal", "13"),
     /**
      * The TotalCredit literal.
      * 
      * @generated
      */
     TOTALCREDIT("TotalCredit", "14"),
     /**
      * The Quota literal.
      * 
      * @generated
      */
     QUOTA("Quota", "15");

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
    private ThresholdTypeEnum(String inputDescription, String inputCode) {
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
    public static ThresholdTypeEnum getEnumFromCode(String code) {
        for (int i = 0; i < ThresholdTypeEnum.values().length; i++) {
            if (ThresholdTypeEnum.values()[i].getCode().equals(code)) {
                return ThresholdTypeEnum.values()[i];
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
    public static ThresholdTypeEnum getEnumFromDescription(String description) {
        for (int i = 0; i < ThresholdTypeEnum.values().length; i++) {
            if (ThresholdTypeEnum.values()[i].getDescription().equals(description)) {
                return ThresholdTypeEnum.values()[i];
            }
        }
        return null;
    }
}
