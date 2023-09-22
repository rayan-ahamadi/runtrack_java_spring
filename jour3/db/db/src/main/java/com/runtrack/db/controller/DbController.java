package com.runtrack.db.controller;
import com.runtrack.db.PersonRepository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.runtrack.db.Person.Person;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class DbController {

    @Autowired
    PersonRepository personRepository;
    Person Peter = new Person( "Peter", "Parker");
    Person Miles = new Person( "Miles", "Morales");
    Person Gwen = new Person( "Gwen", "Stacy");


    @GetMapping("/")
    public String index(Model model) {
        personRepository.save(Peter);
        personRepository.save(Miles);
        personRepository.save(Gwen);

        model.addAttribute("liste", personRepository.findAll());
        System.out.println(personRepository.findAll().get(0).nom);
        return "db";
    }


}
