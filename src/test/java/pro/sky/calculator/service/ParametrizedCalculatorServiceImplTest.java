package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParametrizedCalculatorServiceImplTest {
CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
    @ParameterizedTest
    @MethodSource("provideNums")
    void plus(int num1, int num2) {
        long sum = calculatorService.plus(num1, num2);

        assertEquals((long) num1 + num2, sum);
    }

    @ParameterizedTest
    @MethodSource("provideNums")
    void minus(int num1, int num2) {
        long difference = calculatorService.minus(num1, num2);

        assertEquals((long) num1 - num2, difference);

    }

    @ParameterizedTest
    @MethodSource("provideNums")
    void multiply(int num1, int num2) {
        long productOfMultiplication = calculatorService.multiply(num1, num2);

        assertEquals((long) num1 * num2, productOfMultiplication);
    }

    @ParameterizedTest
    @MethodSource("provideNums")
    void divide(int num1, int num2) {
        double quotientOfDivision = calculatorService.divide(num1, num2);

        assertEquals((double) num1 / num2, quotientOfDivision);
    }
    private  static  Stream<Arguments> provideNums() {
        return Stream.of(
                Arguments.of(5,5),
                Arguments.of(5,-5),
                Arguments.of(Integer.MAX_VALUE, Integer.MAX_VALUE)
        );
    }
}