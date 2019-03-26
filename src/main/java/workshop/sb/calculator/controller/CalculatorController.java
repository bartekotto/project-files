package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {


    @GetMapping("/mul/{a}/{b}")
    public double multiply(@PathVariable double a, @PathVariable double b) {
        return a * b;
    }

    @GetMapping("/div/{a}/{b}")
    public double divide(@PathVariable double a, @PathVariable double b) {
        return a / b;
    }

    @GetMapping("/sum/{a}/{b}")
    public double sum(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    @GetMapping("/sub/{a}/{b}")
    public double subtract(@PathVariable double a, @PathVariable double b) {
        return a - b;
    }
}



