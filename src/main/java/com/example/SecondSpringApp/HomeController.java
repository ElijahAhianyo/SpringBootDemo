package com.example.SecondSpringApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello world!!";
    }
}
/*
service annotation
@autowired
 */