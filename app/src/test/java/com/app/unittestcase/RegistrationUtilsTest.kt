package com.app.unittestcase

import org.junit.Assert
import org.junit.Test

class RegistrationUtilsTest {

    // Write tests for the RegistrationUtil class considering all the conditions
    // annotate each function with @Test
    // We can use backtick to write function name..
    // whatever we write in those backtick will be considered as function name
    @Test
    fun `empty username returns false`() {
        // Pass the value to the function of RegistrationUtil class
        // since RegistrationUtil is an object/ singleton we do not need to create its object
        val result = RegistrationUtils.validRegistrationInput(
            "",
            "123",
            "123"
        )
        // assertThat() comes from the truth library that we added earlier
        // put result in it and assign the boolean that it should return

Assert.assertFalse(result)
    }
}