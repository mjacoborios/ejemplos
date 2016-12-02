
package com.accenture.ang.customerinformation.common.enums;


/**
 * A Enum representation of the ParticipantType object model.
 * 
 * @generated
 */
public enum ParticipantType {

	/**
	 * The Main Holder literal.
	 * 
	 * @generated
	 */
	MAIN_HOLDER("Main Holder", "Main Holder"),

	/**
	 * The Holder literal.
	 * 
	 * @generated
	 */
	HOLDER("Holder", "Holder"),

	/**
	 * The Authorized literal.
	 * 
	 * @generated
	 */
	AUTHORIZED("Authorized", "Authorized"),

	/**
	 * The Donor literal.
	 * 
	 * @generated
	 */
	DONOR("Donor", "Donor"),

	/**
	 * The Guarantor literal.
	 * 
	 * @generated
	 */
	GUARANTOR("Guarantor", "Guarantor"),

	/**
	 * The Representative literal.
	 * 
	 * @generated
	 */
	REPRESENTATIVE("Representative", "Representative");

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
	private ParticipantType(String inputDescription, String inputCode) {
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
	public static ParticipantType getEnumFromCode(String code) {
		for (int i = 0; i < ParticipantType.values().length; i++) {
			if (ParticipantType.values()[i].getCode().equals(code)) {
				return ParticipantType.values()[i];
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
	public static ParticipantType getEnumFromDescription(String description) {
		for (int i = 0; i < ParticipantType.values().length; i++) {
			if (ParticipantType.values()[i].getDescription()
					.equals(description)) {
				return ParticipantType.values()[i];
			}
		}
		return null;
	}
}

