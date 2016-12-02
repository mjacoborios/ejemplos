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
 * Enumerator with possible behaviour to call MCP Calendar services.
 * 
 * @generated
 */
public enum CalendarBehaviourEnum {

    /**
     * The Next working day literal.
     * 
     * @generated
     */
    NEXT_WORKING_DAY("Next working day", "NWD"),

    /**
     * The Previous working day literal.
     * 
     * @generated
     */
    PREVIOUS_WORKING_DAY("Previous working day", "PWD"),

    /**
     * The Next natural day literal.
     * 
     * @generated
     */
    NEXT_NATURAL_DAY("Next natural day", "NND"),

    /**
     * The Previous natural day literal.
     * 
     * @generated
     */
    PREVIOUS_NATURAL_DAY("Previous natural day", "PND");

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
    private CalendarBehaviourEnum(String inputDescription, String inputCode) {
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
    public static CalendarBehaviourEnum getEnumFromCode(String code) {
        for (int i = 0; i < CalendarBehaviourEnum.values().length; i++) {
            if (CalendarBehaviourEnum.values()[i].getCode().equals(code)) {
                return CalendarBehaviourEnum.values()[i];
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
    public static CalendarBehaviourEnum getEnumFromDescription(String description) {
        for (int i = 0; i < CalendarBehaviourEnum.values().length; i++) {
            if (CalendarBehaviourEnum.values()[i].getDescription().equals(description)) {
                return CalendarBehaviourEnum.values()[i];
            }
        }
        return null;
    }
}
