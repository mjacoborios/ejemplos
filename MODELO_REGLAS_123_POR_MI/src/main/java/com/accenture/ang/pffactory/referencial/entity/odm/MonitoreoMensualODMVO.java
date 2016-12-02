/**********************************************************************************************************************
 * Copyright Â© 2010 - 2016, Accenture Software, All Rights Reserved.
 * 
 * Project Name:    PF_FACTORY_INTEGRATION
 *
 * Description:     pff Integration project contains all data exchanged between 
 *                  presentation layer and business hub (value objects, identifiers, enums, etc.) 
 *                  of pff application. 
 *
 * Application:     Product and Fee Factory
 * 
 * Company:         Accenture 
 * 
 * The trademarks used in these materials are the properties of their respective owners.
 * This work is protected by copyright law and contains valuable trade secrets and confidential information.
 **********************************************************************************************************************
 */
package com.accenture.ang.pffactory.referencial.entity.odm;

import java.io.Serializable;

import javax.validation.constraints.Digits;

/**
 * A Class representation of the MonitoreoMensualODMVO model object.
 * 
 * @generated
 */
public class MonitoreoMensualODMVO implements Serializable {

	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Member variable for Prime Number Hashcode.
	 */
	private static final int PRIME_NUMBER_HASHCODE = 31;

	/**
	 * The numComprasRealizadas attribute.
	 * 
	 * @generated
	 */
	@Digits(integer = 10, fraction = 0)
	private Integer numComprasRealizadas;

	/**
	 * The numPagosVencidosMes attribute.
	 * 
	 * @generated
	 */
	@Digits(integer = 10, fraction = 0)
	private Integer numPagosVencidosMes;

	/**
	 * The pagoBxI attribute.
	 * 
	 * @generated
	 */
	private Boolean pagoBxI;

	/**
	 * Retrieves the numComprasRealizadas.
	 * 
	 * @return the numComprasRealizadas return value.
	 * 
	 * @generated
	 */
	public Integer getNumComprasRealizadas() {
		/* Begin: Custom Code */
		return this.numComprasRealizadas;
		/* End: Custom Code */
	}

	/**
	 * Sets the numComprasRealizadas.
	 * 
	 * @param numComprasRealizadas
	 *            the numComprasRealizadas parameter variable.
	 * 
	 * @generated
	 */
	public void setNumComprasRealizadas(Integer numComprasRealizadas) {
		this.numComprasRealizadas = numComprasRealizadas;
		/* Begin: Custom Code */
		/* End: Custom Code */
	}

	/**
	 * Retrieves the numPagosVencidosMes.
	 * 
	 * @return the numPagosVencidosMes return value.
	 * 
	 * @generated
	 */
	public Integer getNumPagosVencidosMes() {
		/* Begin: Custom Code */
		return this.numPagosVencidosMes;
		/* End: Custom Code */
	}

	/**
	 * Sets the numPagosVencidosMes.
	 * 
	 * @param numPagosVencidosMes
	 *            the numPagosVencidosMes parameter variable.
	 * 
	 * @generated
	 */
	public void setNumPagosVencidosMes(Integer numPagosVencidosMes) {
		this.numPagosVencidosMes = numPagosVencidosMes;
		/* Begin: Custom Code */
		/* End: Custom Code */
	}

	/**
	 * Retrieves the pagoBxI.
	 * 
	 * @return the pagoBxI return value.
	 * 
	 * @generated
	 */
	public Boolean getPagoBxI() {
		/* Begin: Custom Code */
		return this.pagoBxI;
		/* End: Custom Code */
	}

	/**
	 * Sets the pagoBxI.
	 * 
	 * @param pagoBxI
	 *            the pagoBxI parameter variable.
	 * 
	 * @generated
	 */
	public void setPagoBxI(Boolean pagoBxI) {
		this.pagoBxI = pagoBxI;
		/* Begin: Custom Code */
		/* End: Custom Code */
	}

	/**
	 * Method to generate hash code value of each attribute.
	 * 
	 * @return a hash code value for this object.
	 * 
	 * @generated
	 */
	@Override
	public int hashCode() {
		int result = 1;
		result = MonitoreoMensualODMVO.PRIME_NUMBER_HASHCODE
				* result
				+ ((this.numComprasRealizadas == null) ? 0
						: this.numComprasRealizadas.hashCode());
		result = MonitoreoMensualODMVO.PRIME_NUMBER_HASHCODE
				* result
				+ ((this.numPagosVencidosMes == null) ? 0
						: this.numPagosVencidosMes.hashCode());
		result = MonitoreoMensualODMVO.PRIME_NUMBER_HASHCODE * result
				+ ((this.pagoBxI == null) ? 0 : this.pagoBxI.hashCode());
		/* Begin: Custom Code */
		/* End: Custom Code */
		return result;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare.
	 * @return true if this object is the same as the obj argument; false
	 *         otherwise.
	 * 
	 * @generated
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MonitoreoMensualODMVO other = (MonitoreoMensualODMVO) obj;
		if (this.numComprasRealizadas == null) {
			if (other.numComprasRealizadas != null) {
				return false;
			}
		} else if (!this.numComprasRealizadas
				.equals(other.numComprasRealizadas)) {
			return false;
		}
		if (this.numPagosVencidosMes == null) {
			if (other.numPagosVencidosMes != null) {
				return false;
			}
		} else if (!this.numPagosVencidosMes.equals(other.numPagosVencidosMes)) {
			return false;
		}
		if (this.pagoBxI == null) {
			if (other.pagoBxI != null) {
				return false;
			}
		} else if (!this.pagoBxI.equals(other.pagoBxI)) {
			return false;
		}
		/* Begin: Custom Code */
		/* End: Custom Code */
		return true;
	}
}

