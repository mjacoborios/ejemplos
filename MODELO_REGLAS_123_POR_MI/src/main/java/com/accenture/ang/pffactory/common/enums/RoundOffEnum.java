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
 * A Enum representation of the RoundOffEnum object model.
 * 
 * @generated
 */
public enum RoundOffEnum {

    /**
     * The Integer Down literal.
     * 
     * @generated
     */
    INTEGER_DOWN("Integer Down", "1"),
     /**
      * The Integer Up literal.
      * 
      * @generated
      */
     INTEGER_UP("Integer Up", "2"),
     /**
      * The Half Down literal.
      * 
      * @generated
      */
     HALF_DOWN("Half Down", "3"),
     /**
      * The Half Up literal.
      * 
      * @generated
      */
     HALF_UP("Half Up", "4"),
     /**
      * The Quarter Down literal.
      * 
      * @generated
      */
     QUARTER_DOWN("Quarter Down", "5"),
     /**
      * The Quarter Up literal.
      * 
      * @generated
      */
     QUARTER_UP("Quarter Up", "6"),
     /**
      * The No Rounded literal.
      * 
      * @generated
      */
     NO_ROUNDED("No Rounded", "7");

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
    private RoundOffEnum(String inputDescription, String inputCode) {
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
    public static RoundOffEnum getEnumFromCode(String code) {
        for (int i = 0; i < RoundOffEnum.values().length; i++) {
            if (RoundOffEnum.values()[i].getCode().equals(code)) {
                return RoundOffEnum.values()[i];
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
    public static RoundOffEnum getEnumFromDescription(String description) {
        for (int i = 0; i < RoundOffEnum.values().length; i++) {
            if (RoundOffEnum.values()[i].getDescription().equals(description)) {
                return RoundOffEnum.values()[i];
            }
        }
        return null;
    }
}
