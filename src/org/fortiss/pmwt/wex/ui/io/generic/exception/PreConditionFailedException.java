/***************************************************************************
 * Copyright (c) 2016 the WESSBAS project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/

package org.fortiss.pmwt.wex.ui.io.generic.exception;

/**
 * Thrown, if the pre-condition failed to execute.
 */

public class PreConditionFailedException extends GenericReaderException {
	private static final long serialVersionUID = 1L;

	public PreConditionFailedException(Throwable throwable) {
		super(throwable);
	}

	public PreConditionFailedException(String message) {
		super(message);
	}
}
