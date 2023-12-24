package com.project.A1Furnitures.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FurnitureController {

    @GetMapping("/")
    public String initial(){
        return "Success";
    }

}
