package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final CalculatorService calculatorService;
    public Controller(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/calculator")
    public String welcome () {
        return CalculatorService.welcome();
    }
}
