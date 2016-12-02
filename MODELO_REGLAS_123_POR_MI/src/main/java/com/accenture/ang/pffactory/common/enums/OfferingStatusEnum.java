/**********************************************************************************************************************
 * Copyright © 2010 - 2012, Accenture Software, All Rights Reserved.
 * 
 * Project Name: PF_FACTORY_INTEGRATION
 * 
 * Description: PFF Integration project contains all data exchanged between presentation layer and business hub (value
 * objects, identifiers, enums, etc.) of PFF application.
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
 * <p>
 * The possible status of an offering will be:
 * </p>
 * <p>
 * Cancelled: The offering has been cancelled.
 * </p>
 * <p>
 * Under construction: the offering has basic&nbsp;data and product
 * assigned&nbsp;(price variations is optional) but is not published&nbsp;
 * </p>
 * <p>
 * On Offer: The offering&nbsp;has all the information, elegibility and
 * marketing, has the product or bundle product associated&nbsp;and is ready to
 * be use&nbsp;
 * </p>
 * <p>
 * To be Publised: The offering&nbsp;has all the information, elegibility and
 * marketing, has the product or bundle product associated&nbsp;and is ready to
 * be publish in the catalogue for being used.&nbsp;
 * </p>
 * .
 * 
 * @generated
 */
public enum OfferingStatusEnum {

    /**
	 * The To be published literal.
	 * 
	 * @generated
	 */
    TO_BE_PUBLISHED("To be published", "1"),

    /**
	 * The On Offer literal.
	 * 
	 * @generated
	 */
    ON_OFFER("On Offer", "2"),

    /**
	 * The Cancelled literal.
	 * 
	 * @generated
	 */
    CANCELLED("Cancelled", "3"),

    /**
	 * The Under Construction literal.
	 * 
	 * @generated
	 */
    UNDER_CONSTRUCTION("Under Construction", "4"),
    
    /**
	 * The No Offering literal.
	 * 
	 * @generated
	 */
    NO_OFFERING("No Offering", "5");

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
    private OfferingStatusEnum(String inputDescription, String inputCode) {
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
    public static OfferingStatusEnum getEnumFromCode(String code) {
        for (int i = 0; i < OfferingStatusEnum.values().length; i++) {
            if (OfferingStatusEnum.values()[i].getCode().equals(code)) {
                return OfferingStatusEnum.values()[i];
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
    public static OfferingStatusEnum getEnumFromDescription(String description) {
        for (int i = 0; i < OfferingStatusEnum.values().length; i++) {
            if (OfferingStatusEnum.values()[i].getDescription().equals(description)) {
                return OfferingStatusEnum.values()[i];
            }
        }
        return null;
    }
}
