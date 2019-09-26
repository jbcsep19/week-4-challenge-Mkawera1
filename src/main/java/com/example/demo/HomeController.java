package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(){
        return "Home";
    }
    @GetMapping("/About")
    public String About(){
        return "About";
    }
    @GetMapping("/Profile")
    public String Profile(){
        return "Profile";
    }
    @GetMapping("/GitHub")
    public String GitHub(){
        return "GitHub";
    }
    @GetMapping("/Algorithms")
    public String Algorithms(){
        return "Algorithms";

    }
    @GetMapping("/CoreJava")
    public String CoreJava(){
        return "CoreJava";
    }
    @GetMapping("/ObjectOriented")
    public String ObjectOriented(){
        return "ObjectOriented";

    }
    @GetMapping("/Bootstrap")
    public String Bootstrap(){
        return "Bootstrap";
    }
}
