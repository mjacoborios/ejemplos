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
 * It indicates the different types of a parameter, specially used for simulations parameters..
 * 
 * @generated
 */
public enum ParamDataTypeEnum {

    /**
     * String parameter..
     * 
     * @generated
     */
    STRING("String", "String"),

    /**
     * Numeric parameter..
     * 
     * @generated
     */
    DOUBLE("Double", "Double"),

    /**
     * Parameter that has to be selected from a list and represented in a drop down combo..
     * 
     * @generated
     */
    PAYFREQUENCYENUM("PayFrequencyEnum", "PayFrequencyEnum"),

    /**
     * Parameter formed by a String and Combo parameters..
     * 
     * @generated
     */
    INTEGER("Integer", "Integer"),

    /**
     * The BigDecimal literal.
     * 
     * @generated
     */
    BIGDECIMAL("BigDecimal", "BigDecimal"),

    /**
     * The ItemPeriodTypeEnum literal.
     * 
     * @generated
     */
    ITEMPERIODTYPEENUM("ItemPeriodTypeEnum", "ItemPeriodTypeEnum"),

    /**
     * The CurrencyCodeEnum literal.
     * 
     * @generated
     */
    CURRENCYCODEENUM("CurrencyCodeEnum", "CurrencyCodeEnum"),

    /**
     * The Long literal.
     * 
     * @generated
     */
    LONG("Long", "Long"),

    /**
     * The ChannelCodeEnum literal.
     * 
     * @generated
     */
    CHANNELCODEENUM("ChannelCodeEnum", "ChannelCodeEnum"),

    /**
     * The StateEnum literal.
     * 
     * @generated
     */
    STATEENUM("StateEnum", "StateEnum");

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
    private ParamDataTypeEnum(String inputDescription, String inputCode) {
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
    public static ParamDataTypeEnum getEnumFromCode(String code) {
        for (int i = 0; i < ParamDataTypeEnum.values().length; i++) {
            if (ParamDataTypeEnum.values()[i].getCode().equals(code)) {
                return ParamDataTypeEnum.values()[i];
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
    public static ParamDataTypeEnum getEnumFromDescription(String description) {
        for (int i = 0; i < ParamDataTypeEnum.values().length; i++) {
            if (ParamDataTypeEnum.values()[i].getDescription().equals(description)) {
                return ParamDataTypeEnum.values()[i];
            }
        }
        return null;
    }
}
