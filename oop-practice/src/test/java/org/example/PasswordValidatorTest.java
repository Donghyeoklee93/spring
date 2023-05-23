package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
password must be between 8 and 12 characters
if password is less than 8 or more than 12 characters, IllegalArgumentException occurs.
Test code for boundary condition must write.
*/

public class PasswordValidatorTest {

    @DisplayName("Valid password is 8 - 12 lengths")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();
    }

    @DisplayName("if password is less than 8 or more than 12 characters, IllegalArgumentException occurs.")
    @ParameterizedTest
    @ValueSource(strings = {"aabbccd", "aabbccddeeffg"})
    void validatePasswordTest2(String password) {

        assertThatCode(() -> PasswordValidator.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Password must be between 8 and 12 characters");
    }
}
