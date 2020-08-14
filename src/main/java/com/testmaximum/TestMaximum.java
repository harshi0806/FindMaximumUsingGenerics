package com.testmaximum;

public class TestMaximum {
    /**
     * Function to find the maximum Integer value
     * @param num1 is integer number at position1
     * @param num2 is integer number at position2
     * @param num3 is integer number at position3
     * @return max
     */
    public Integer findMaximumInteger(Integer num1, Integer num2, Integer num3) {
        //num1 is largest so far
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            //num2 is largest so far
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            //num3 is largest so far
            max = num3;
        }
        return max;
    }

    /**
     * Function to find the maximum Float value
     * @param num1 is float number at position1
     * @param num2 is float number at position2
     * @param num3 is float number at position3
     * @return max
     */
    public Float findMaximumFloat(Float num1, Float num2, Float num3){
        Float max = num1;
        if(num2.compareTo(num1) > 0){
            max = num2;
        }
        if(num3.compareTo(num2) > 0){
            max = num3;
        }
        return max;
    }
}
