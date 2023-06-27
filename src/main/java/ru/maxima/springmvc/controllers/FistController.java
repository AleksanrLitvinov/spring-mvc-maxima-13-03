package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class FistController {

    // аннотация служет для рутироания запроса
    @GetMapping("/hello")
    public String helloPage(@RequestParam("name")String nameFromParameter,
                            Model model) {
        System.out.println(nameFromParameter);
        model.addAttribute("name", nameFromParameter);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }


}
