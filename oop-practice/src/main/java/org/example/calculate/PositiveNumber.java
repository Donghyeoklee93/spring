package org.example.calculate;

public class PositiveNumber {
    private final int value;

    public PositiveNumber(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value){
        if(isNegativeNumber(value)){
            throw new IllegalArgumentException("Cannot use 0 or negative number.");
        }
    }

    private boolean isNegativeNumber(int value) {
        return value <= 0;
    }


    public int toInt(){
        return value;
    }
}
