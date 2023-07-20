package pro.sky.calculator;

public interface CalculatorService {
    static String welcome() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    static String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    static String minus(int num1, int num2) {
        int difference = num1 - num2;
        return num1 + " - " + num2 + " = " + difference;
    }

    static String multiply(int num1, int num2) {
        int productOfMultiplication = num1 * num2;
        return num1 + " * " + num2 + " = " + productOfMultiplication;
    }

    static String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new RuntimeException("На ноль делить нельзя!");
        } else {
            double quotientOfDivision = (double) num1 / num2;
            return num1 + " / " + num2 + " = " + quotientOfDivision;
        }
    }
}
