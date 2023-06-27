package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Сделать калькулятор, который будет принимать в качестве аргументов запроса две переменные и вид операции
//        и будет возвращать пользователю результат математической операции в виде html - страницы
// +=	%2B
// http://localhost:8080/calculator?x=2&y=2&operations=%2B
@Controller

public class CalculatorController {
    @GetMapping("/calculator")

    public String getCalculator(@RequestParam("x")double x,
                                @RequestParam("y")double y,
                                @RequestParam("operations")String operations,
                                Model model) {
        var result = switch (operations) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> "Неправельно";
        };
        model.addAttribute("result",String.valueOf(result));
        return "first/calculator";
    }


}
