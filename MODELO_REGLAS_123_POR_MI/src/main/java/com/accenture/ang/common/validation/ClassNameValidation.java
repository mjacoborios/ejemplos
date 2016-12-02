/**************************************************************************************************************************
 * Copyright (c) 2010 - 2011, Accenture Software Solutions, All Rights Reserved.
 * 
 * Project Name: ANG_ARCHITECTURE_COMMON Description : This jar contains the utility classes Artifact ID :
 * ANG_ARCHITECTURE_COMMON
 * 
 * Version: 0.0.6-SNAPSHOT Company: Accenture
 ************************************************************************************************************************** 
 */
package com.accenture.ang.common.validation;

// TODO: Auto-generated Javadoc
/**
 * The Interface ClassValidation provides a functionallity to avoid Reflection Injection risk.
 */
public interface ClassNameValidation {

    /**
     * Transforms the class name received as parameter into a new one to minimize the risk of Reflection Injection, 
     * reflection statement accessing classes, methods or fields should be created and executed as locally as possible. 
     * 
     * @param className received
     * @return the className once it is validated
     */
    public String validateClassName(String className);
}
