package org.example.calculate;

public class DivisionOperator implements NewArithmeticInterface {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
//        if(operand2.toInt() == 0){
//            throw new IllegalArgumentException("Cannot divide by 0");
//        }
        return operand1.toInt() / operand2.toInt();
    }
}
