package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    int num1 = 1;
    int num2 = 2;

    @Test
    void plus_shouldReturnPositiveNumberWhenNum1AndNum2ArePositive(){
        long sum = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, sum);
    }
    @Test
    void plus_shouldReturnNegstiveNumberWhenNum1IsNegativeAndNum2ArePositiveAndNum1BiggerThenNum2(){
        int num1 = -3;
        long sum = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, sum);
    }
    @Test
    void minus_shouldReturnPositiveNumberWhenNum1AndNum2ArePositiveAndNum1BiggerThenNum2(){
        int num1 = 7;
        long difference = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, difference);
    }
    @Test
    void minus_shouldReturnNegstiveNumberWhenNum1AndNum2ArePositiveAndNum2BiggerThenNum1(){
        long difference = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, difference);
    }
}
