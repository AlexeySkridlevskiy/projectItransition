package com.example.projectitransition;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String greeting(Model model) {
        model.addAttribute("message", "Hello World");
        return "helloworld";
    }

}