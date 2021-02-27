/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoJPA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author josemeva
 */
@Controller
public class HolaController {

    @RequestMapping("/")
//    @RequestMapping(value="/mensaje", method = RequestMethod.GET)
    public String mensaje() {

        return "mensaje";
    }

    
    @GetMapping("/hola")
    public String hello(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {

        model.addAttribute("name", name);

        return "hello";

    }
}
