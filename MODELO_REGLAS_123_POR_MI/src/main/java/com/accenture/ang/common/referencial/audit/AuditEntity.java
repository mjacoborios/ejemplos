/**
 * 
 */
package com.accenture.ang.common.referencial.audit;

import java.io.Serializable;
import java.util.Date;


/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->.
 * @generated
 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AuditEntity implements Serializable {
    
    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->.
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    private String entityLastMod;

    /**
     * Gets the entity last mod.
     * @return the entity last mod
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    public String getEntityLastMod() {
        // begin-user-code
        return this.entityLastMod;
        // end-user-code
    }

    /**
     * Sets the entity last mod.
     * @param entityLastMod
     *            the new entity last mod
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    public void setEntityLastMod(String entityLastMod) {
        // begin-user-code
        this.entityLastMod = entityLastMod;
        // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->.
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    private String branchLastMod;

    /**
     * Gets the branch last mod.
     * @return the branch last mod
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    public String getBranchLastMod() {
        // begin-user-code
        return this.branchLastMod;
        // end-user-code
    }

    /**
     * Sets the branch last mod.
     * @param branchLastMod
     *            the new branch last mod
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    public void setBranchLastMod(String branchLastMod) {
        // begin-user-code
        this.branchLastMod = branchLastMod;
        // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->.
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    private String userLastMod;

    /**
     * Gets the user last mod.
     * @return the user last mod
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    public String getUserLastMod() {
        // begin-user-code
        return this.userLastMod;
        // end-user-code
    }

    /**
     * Sets the user last mod.
     * @param userLastMod
     *            the new user last mod
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    public void setUserLastMod(String userLastMod) {
        // begin-user-code
        this.userLastMod = userLastMod;
        // end-user-code
    }

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->.
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    private Date timeLastMod;

    /**
     * Gets the time last mod.
     * @return the time last mod
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    public Date getTimeLastMod() {
        // begin-user-code
        return (timeLastMod == null)? null : (Date) timeLastMod.clone();
        // end-user-code
    }

    /**
     * Sets the time last mod.
     * @param timeLastMod
     *            the new time last mod
     */
    public void setTimeLastMod(Date timeLastMod) {
        this.timeLastMod = (timeLastMod == null)? null : (Date) timeLastMod.clone();
    }
}
