package org.launchcode.collectioncatalogue.controllers;

import org.launchcode.collectioncatalogue.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String index(Model model, HttpServletRequest request){
        model.addAttribute("title", "Collection Catalogue");
        return "index";
    }
}