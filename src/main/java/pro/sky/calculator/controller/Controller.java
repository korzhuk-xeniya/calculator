package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;
import pro.sky.calculator.service.CalculatorServiceImpl;

@RestController
@RequestMapping(path = "/calculator")
public class Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        long sum = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + sum;
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        long difference = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + difference;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        long productOfMultiplication = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + productOfMultiplication;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        double quotientOfDivision = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + quotientOfDivision;
    }
}
