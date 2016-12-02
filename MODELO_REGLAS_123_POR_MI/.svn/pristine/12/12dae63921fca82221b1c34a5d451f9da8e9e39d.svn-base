/**********************************************************************************************************************
 * Copyright Â© 2010 - 2012, Accenture Software, All Rights Reserved.
 * 
 * Project Name: COMMON_INTERFACES_INTEGRATION
 * 
 * Description: COMMON_INTERFACES Integration project contains all data exchanged between presentation layer and
 * business hub (value objects, identifiers, enums, etc.) of COMMON_INTERFACES application.
 * 
 * Application:
 * 
 * Company: Accenture
 * 
 * The trademarks used in these materials are the properties of their respective owners. This work is protected by
 * copyright law and contains valuable trade secrets and confidential information.
 ********************************************************************************************************************** 
 */
package com.accenture.ang.general.common.enums;

/**
 * <p>
 * Enumeration of contact type. It identifies if it is the Main contact record or other
 * </p>
 * .
 * 
 * @generated
 */
public enum ContactTypeEnum {

    /**
     * The Home/Company literal.
     * 
     * @generated
     */
    HOME_COMPANY("Home/Company", "01"),
     /**
      * The Business literal.
      * 
      * @generated
      */
     BUSINESS("Business", "02"),
     /**
      * The Temporary literal.
      * 
      * @generated
      */
     TEMPORARY("Temporary", "03");

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
    private ContactTypeEnum(String inputDescription, String inputCode) {
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
    public static ContactTypeEnum getEnumFromCode(String code) {
        for (int i = 0; i < ContactTypeEnum.values().length; i++) {
            if (ContactTypeEnum.values()[i].getCode().equals(code)) {
                return ContactTypeEnum.values()[i];
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
    public static ContactTypeEnum getEnumFromDescription(String description) {
        for (int i = 0; i < ContactTypeEnum.values().length; i++) {
            if (ContactTypeEnum.values()[i].getDescription().equals(description)) {
                return ContactTypeEnum.values()[i];
            }
        }
        return null;
    }
}
