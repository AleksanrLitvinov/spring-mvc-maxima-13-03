package ru.maxima.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class HelloController {
    //Аннотация служет для того,чтобы рутировать запрос
    // Create - @PostMapping
    // Read  @GetMapping
    // Update - @PutMapping/@PatchMapping
    // Delete - @DeleteMapping
//    @RequestMapping(method = RequestMethod.GET) устарел
    @GetMapping("/hello")
    // вернет нам предстовления, которое находится в папке views
    public String hello() {
        return "hello_world";
    }


    @DeleteMapping("/delete")
    // вернет нам предстовления, которое находится в папке views
    public String delete() {
        return "hello_world";
    }
}
