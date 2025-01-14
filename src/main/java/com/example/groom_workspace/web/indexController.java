package com.example.groom_workspace.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/") // 루트 url
    public String index() {
        return "index";
    }
}
