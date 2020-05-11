package org.launchcode.collectioncatalogue.controllers;


import org.launchcode.collectioncatalogue.data.ArtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="collections")
public class CollectionsController {

    @Autowired
    private ArtRepository artRepository;

    @RequestMapping(value="art")
    public String displayArt(Model model){
        model.addAttribute("artworks", artRepository.findAll());
        model.addAttribute("title","Art Collection");
        return "art";
    }
}
