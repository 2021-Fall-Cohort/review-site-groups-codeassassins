package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.model.Manufacturer;
import org.wecancodeit.reviews.repos.ManufacturerRepository;
import org.wecancodeit.reviews.repos.PhoneRepository;

@Controller
public class ManufacturerController {

    private ManufacturerRepository manufacturerRepo;
    private PhoneRepository phoneRepo;

    public ManufacturerController(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;
    }

    @RequestMapping("/manufacturers")
    public String listManufacturers(Model model) {

        model.addAttribute("manufacturer", manufacturerRepo.findAll());
        return "manufacturers";
    }


    @RequestMapping("manufacturers/{id}")
    public String showManufacturer(Model model, @PathVariable long id) {

        model.addAttribute("manufacturer", manufacturerRepo.findById(id).get());

        return "manufacturer";
    }


}
