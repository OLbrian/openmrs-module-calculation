/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation;

import java.util.Set;

import org.openmrs.calculation.definition.ParameterDefinition;

/**
 * A Calculation represents a definition that can be evaluated to produce data.
 */
public interface Calculation {
	
	/**
	 * Gets all the parameters supported by this {@link Calculation}
	 * 
	 * @return a list if {@link ParameterDefinition}s
	 */
	public Set<ParameterDefinition> getParameters();
}