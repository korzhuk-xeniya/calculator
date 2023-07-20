package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public static String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
}
