package com.example.Catalog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RouterController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
