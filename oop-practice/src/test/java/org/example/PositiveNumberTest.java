package org.example;

import org.example.calculate.PositiveNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PositiveNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
//    @Test
    void createTest(int value) {
        assertThatCode(()-> new PositiveNumber(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Cannot use 0 or negative number.");


    }
}
