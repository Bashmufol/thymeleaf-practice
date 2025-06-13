package com.bash.thymeleaftutorial.controller;

import com.bash.thymeleaftutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWord(Model model){
        model.addAttribute("message","Hello World");
        return "hello-world";
    }

    @GetMapping("/variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Bashir Muhammed", "bashmufol@gmail.com",
                "ADMIN", "M");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }
    @GetMapping("/fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = Arrays.asList(
                new User("Bashir", "Bashmufol@gmail.com", "ADMIN", "Male"),
                new User("AbdulSamad", "AbdulSamad@gmail.com", "USER", "Male"),
                new User("Sule",  "Sule@gmail.com", "MODERATOR", "Female")
        );
        model.addAttribute("users", users);
        return "users";
    }
}
