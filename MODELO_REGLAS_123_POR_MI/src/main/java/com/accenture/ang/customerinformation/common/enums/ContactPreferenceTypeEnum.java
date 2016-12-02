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
 * Enumeration for the type of contact preferences of a customer.
 * 
 * @generated
 */
public enum ContactPreferenceTypeEnum {

    /**
     * The MobilePhone literal.
     * 
     * @generated
     */
    MOBILEPHONE("MobilePhone", "0"),

    /**
     * The HomePhone literal.
     * 
     * @generated
     */
    HOMEPHONE("HomePhone", "1"),

    /**
     * The BusinessPhone literal.
     * 
     * @generated
     */
    BUSINESSPHONE("BusinessPhone", "2"),

    /**
     * The OtherPhone literal.
     * 
     * @generated
     */
    OTHERPHONE("OtherPhone", "3"),

    /**
     * The Email literal.
     * 
     * @generated
     */
    EMAIL("Email", "4"),

    /**
     * The PostalAddress literal.
     * 
     * @generated
     */
    POSTALADDRESS("PostalAddress", "5"),

    /**
     * The SMSMessage literal.
     * 
     * @generated
     */
    SMSMESSAGE("SMSMessage", "6");

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
    private ContactPreferenceTypeEnum(String inputDescription, String inputCode) {
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
    public static ContactPreferenceTypeEnum getEnumFromCode(String code) {
        for (int i = 0; i < ContactPreferenceTypeEnum.values().length; i++) {
            if (ContactPreferenceTypeEnum.values()[i].getCode().equals(code)) {
                return ContactPreferenceTypeEnum.values()[i];
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
    public static ContactPreferenceTypeEnum getEnumFromDescription(String description) {
        for (int i = 0; i < ContactPreferenceTypeEnum.values().length; i++) {
            if (ContactPreferenceTypeEnum.values()[i].getDescription().equals(description)) {
                return ContactPreferenceTypeEnum.values()[i];
            }
        }
        return null;
    }
}

