package com.nasva;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping({"/salam"})
    public String saySalam(){
        return "salam";
    }
}