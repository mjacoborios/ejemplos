/**********************************************************************************************************************
 * Copyright Ãƒâ€šÃ‚Â© 2010 - 2012, Accenture Software, All Rights Reserved.
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

import com.accenture.ang.common.config.ConfigParamCode;

/**
 * Enumeration to include the parameters configured via database.
 * 
 * @generated
 */
public enum GeneralConfigParamEnum implements ConfigParamCode {

    /**
     * The localCountry literal.
     * 
     * @generated
     */
    LOCALCOUNTRY("0", "localcountry"),
     /**
      * The localCurrency literal.
      * 
      * @generated
      */
     LOCALCURRENCY("1", "localcurrency"),
     /**
      * The localTimeZone literal.
      * 
      * @generated
      */
     LOCALTIMEZONE("2", "localtimezone"),
     /**
      * The customTree literal.
      * 
      * @generated
      */
     CUSTOMTREE("customTree", "customtree"),
     /**
      * The N/A literal.
      * 
      * @generated
      */
     N_A("NA", "n_a"),
     /**
      * The Commercial literal.
      * 
      * @generated
      */
     COMMERCIAL("COMMERCIALTREE", "commercial");

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
    private GeneralConfigParamEnum(String inputMessage, String inputCode) {
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
    public static GeneralConfigParamEnum getEnumFromCode(String code) {
        for (int i = 0; i < GeneralConfigParamEnum.values().length; i++) {
            if (GeneralConfigParamEnum.values()[i].getCode().equals(code)) {
                return GeneralConfigParamEnum.values()[i];
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
    public static GeneralConfigParamEnum getEnumFromMessage(String message) {
        for (int i = 0; i < GeneralConfigParamEnum.values().length; i++) {
            if (GeneralConfigParamEnum.values()[i].getMessage().equals(message)) {
                return GeneralConfigParamEnum.values()[i];
            }
        }
        return null;
    }
}
