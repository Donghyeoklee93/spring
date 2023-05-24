package org.example;

import org.example.calculate.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * requirements
 * 1. it can perform simple arithmetic operations
 * 2. it can calculate only with positive numbers
 * 3. An IllegalArgumentException is thrown when dividing by zero in division operation.
 * 4. It is implemented based on the MVC (Model-View-Controller) pattern.
 */


public class calculatorTest {

    // 1 + 2 -----> Calculator
    //  3    <----
//    @DisplayName("it can perform addition operation")
//    @Test
//    void addition() {
//        int result = Calculator.calculate(1, "+", 2);
//
//        assertThat(result).isEqualTo(3);
//    }
//
//    @DisplayName("it can perform subtraction operation")
//    @Test
//    void subtractionTest() {
//        int result = Calculator.calculate(1, "-", 2);
//
//        assertThat(result).isEqualTo(-1);
//    }


    @DisplayName("arithmetic operations")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void calculateTest(int operand1, String operator, int operand2, int result) {
        int calculateResult = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        assertThat(result).isEqualTo(calculateResult);

    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
        );
    }

//    @DisplayName("An IllegalArgumentException is thrown when dividing by zero in division operation.")
//    @Test
//    void caculateExceptionTest() {
//        assertThatCode(() -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0)))
//                .isInstanceOf(IllegalArgumentException.class)
//                .hasMessage("Cannot divide by 0");
//    }
}
