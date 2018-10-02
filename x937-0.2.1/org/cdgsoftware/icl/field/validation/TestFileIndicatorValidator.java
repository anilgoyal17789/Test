/*
 * CDG Software
 * Copyright (C) 2010 Jeff Gordy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.cdgsoftware.icl.field.validation;

import org.cdgsoftware.icl.util.ICLException;

/**
 * The Class TestFileIndicatorValidator.
 */
public class TestFileIndicatorValidator extends Validator {
    public static final TestFileIndicatorValidator INSTANCE = new TestFileIndicatorValidator();

    /* (non-Javadoc)
     * @see org.cdgsoftware.icl.field.validation.Validator#validateData(java.lang.String)
     */
    @Override
    public ValidationResult validateData(String data) throws ICLException {
        ValidationResult result = new ValidationResult();
        if (data.toUpperCase().equals("T") || data.toUpperCase().equals("P")) {
            result.setMessage("Test File Indicator is valid");
            result.setDataValid(true);
        } else {
            result.setMessage("Test File Indicator [" + data + "] did not pass validation check!");
            result.setDataValid(false);
        }
        return result;
    }

}
