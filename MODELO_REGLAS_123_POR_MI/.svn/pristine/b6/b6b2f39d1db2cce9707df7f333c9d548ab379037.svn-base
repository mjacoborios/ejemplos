/**********************************************************************************************************************
 * Copyright Â© 2010 - 2013, Accenture Software, All Rights Reserved.
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

import com.accenture.ang.common.config.ConfigCategoryCode;

/**
 * Enumeration to include the categories configured via database.
 * 
 * @generated
 */
public enum GeneralConfigCategoryGroupEnum implements ConfigCategoryCode {

    /**
     * The pff literal.
     * 
     * @generated
     */
    PFF("pff", "pff");

    /**
     * The message of the enumeration.
     * 
     * @generated
     */
    private String message;

    /**
     * The code of the enumeration.
     * 
     * @generated
     */
    private String code;

    /**
     * Retrieves the Message.
     * 
     * @return the message
     * 
     * @generated
     */
    @Override
    public String getMessage() {
        /* Begin: Custom Code */
        return this.message;
        /* End: Custom Code */
    }

    /**
     * Retrieves the Code.
     * 
     * @return the code
     * 
     * @generated
     */
    @Override
    public String getCode() {
        /* Begin: Custom Code */
        return this.code;
        /* End: Custom Code */
    }

    /**
     * Sets the name and the value.
     * 
     * @param inputMessage
     *            message to set
     * @param inputCode
     *            code to set
     * 
     * @generated
     */
    private GeneralConfigCategoryGroupEnum(String inputMessage, String inputCode) {
        this.message = inputMessage;
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
    public static GeneralConfigCategoryGroupEnum getEnumFromCode(String code) {
        for (int i = 0; i < GeneralConfigCategoryGroupEnum.values().length; i++) {
            if (GeneralConfigCategoryGroupEnum.values()[i].getCode().equals(code)) {
                return GeneralConfigCategoryGroupEnum.values()[i];
            }
        }
        return null;
    }

    /**
     * Gets the enum from message.
     * 
     * @param message
     *            the message
     * 
     * @return the enum from message
     * 
     * @generated
     */
    public static GeneralConfigCategoryGroupEnum getEnumFromMessage(String message) {
        for (int i = 0; i < GeneralConfigCategoryGroupEnum.values().length; i++) {
            if (GeneralConfigCategoryGroupEnum.values()[i].getMessage().equals(message)) {
                return GeneralConfigCategoryGroupEnum.values()[i];
            }
        }
        return null;
    }
}
