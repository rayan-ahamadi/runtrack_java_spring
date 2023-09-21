package com.runtrack.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ViewController {
    List<String> liste = Arrays.asList("Peter Parker","Miles Morales","Ben Reilly", "Kaine Parker","Jessica Drew");
    @GetMapping("/")
    public String get(Model model) {
        model.addAttribute("liste",liste);
        return "view";
     }

     @PostMapping("/FormsResult")
    public String post(@RequestParam("name") String name, Model model){
        model.addAttribute("liste",liste);
        model.addAttribute("name", name);
        return "ResultView";
     }

}
