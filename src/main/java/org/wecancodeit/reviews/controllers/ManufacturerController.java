package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/manufacturers/{id}")
    public String listManufacturers(Model model, @PathVariable long id) {
        model.addAttribute("manufacturer", manufacturerRepo.findById(id).get());
        return "manufacturer";
    }


}
