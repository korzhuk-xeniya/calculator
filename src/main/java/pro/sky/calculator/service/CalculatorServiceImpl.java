package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exception.DividedException;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public long plus(int num1, int num2) {
        return (long) num1 + num2;
    }

    @Override
    public long minus(int num1, int num2) {
        return (long) num1 - num2;
    }

    @Override
    public long multiply(int num1, int num2) {
        return (long) num1 * num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DividedException("На ноль делить нельзя!");
        } else {
            return (double) num1 / num2;
        }
    }
}

