/**********************************************************************************************************************
 * Copyright Â© 2010 - 2012, Accenture Software, All Rights Reserved.
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
package com.accenture.ang.general.common.identifiers;

import java.io.Serializable;


/**
 * Unique identifier for a Basic Product in Product&Fee factory..
 * 
 * @generated
 */
public class BasicProductID implements Serializable {
    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Entity for multientity functionality.
     * </p>
     * . Switched due to workaround to fix 43358
     */
    private String entity;

    /**
     * Code&nbsp;asigned&nbsp;to&nbsp;a&nbsp;Basic
     * Product&nbsp;in&nbsp;Product&Fee&nbsp;factory.&nbsp;It&nbsp;can&nbsp;be
     * &nbsp;asigned&nbsp;manually&nbsp;by&nbsp;the&nbsp;user&nbsp;or&nbsp;automatically
     * generated&nbsp;by&nbsp;the&nbsp;system.&nbsp;.
     * 
     * Switched due to workaround to fix 43358
     */
    private String basicProductCode;

    /**
     * Instantiates a new basic product id.
     */
    public BasicProductID() {
        super();
    }

    /**
     * Retrieves the basicProductCode.
     * 
     * @return .
     * 
     * @generated
     */
    public String getBasicProductCode() {
        /* Begin: Custom Code */
        return this.basicProductCode;
        /* End: Custom Code */
    }

    /**
     * Sets the basicProductCode.
     * 
     * @param basicProductCode
     *            Code&nbsp;asigned&nbsp;to&nbsp;a&nbsp;Basic
     *            Product&nbsp;in&nbsp;Product&Fee&nbsp;factory.
     *            &nbsp;It&nbsp;can&nbsp;be&nbsp;asigned&nbsp;manually&nbsp
     *            ;by&nbsp;the&nbsp;user&nbsp;or&nbsp;automatically generated&nbsp;by&nbsp;the&nbsp;system.&nbsp;.
     * 
     * @generated
     */
    public void setBasicProductCode(String basicProductCode) {
        this.basicProductCode = basicProductCode;
        /* Begin: Custom Code */
        /* End: Custom Code */
    }

    /**
     * Retrieves the entity.
     * 
     * @return .
     * 
     * @generated
     */
    public String getEntity() {
        /* Begin: Custom Code */
        return this.entity;
        /* End: Custom Code */
    }

    /**
     * Sets the entity.
     * 
     * @param entity
     *            <p>
     *            Entity for multientity functionality.
     *            </p>
     *            .
     * 
     * @generated
     */
    public void setEntity(String entity) {
        this.entity = entity;
        /* Begin: Custom Code */
        /* End: Custom Code */
    }

    /**
     * Return the string value of BasicProductID.
     * 
     * @return the string value of BasicProductID.
     * 
     */
    /* Begin: Custom Code */
    @Override
    public String toString() {
        return new StringBuffer().append(this.entity).append(";").append(this.basicProductCode).toString();
    }

    /* End: Custom Code */

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.basicProductCode == null) ? 0 : this.basicProductCode.hashCode());
        result = prime * result + ((this.entity == null) ? 0 : this.entity.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof BasicProductID)) {
            return false;
        }
        BasicProductID other = (BasicProductID) obj;
        if (this.basicProductCode == null) {
            if (other.basicProductCode != null) {
                return false;
            }
        } else if (!this.basicProductCode.equals(other.basicProductCode)) {
            return false;
        }
        if (this.entity == null) {
            if (other.entity != null) {
                return false;
            }
        } else if (!this.entity.equals(other.entity)) {
            return false;
        }
        return true;
    }
}
