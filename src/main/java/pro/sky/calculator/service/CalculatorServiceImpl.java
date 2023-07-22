package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public  String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public  String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public  String minus(int num1, int num2) {
        int difference = num1 - num2;
        return num1 + " - " + num2 + " = " + difference;
    }

    public  String multiply(int num1, int num2) {
        int productOfMultiplication = num1 * num2;
        return num1 + " * " + num2 + " = " + productOfMultiplication;
    }

    public  String divide(int num1, int num2) {
//        if (num2 == 0) {
//            throw new RuntimeException("На ноль делить нельзя!");
//        } else {
            double quotientOfDivision = (double) num1 / num2;
            return num1 + " / " + num2 + " = " + quotientOfDivision;
        }
    }

