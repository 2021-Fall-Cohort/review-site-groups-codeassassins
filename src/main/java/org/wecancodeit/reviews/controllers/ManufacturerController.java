package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.model.Manufacturer;
import org.wecancodeit.reviews.model.Phone;
import org.wecancodeit.reviews.repos.ManufacturerRepository;
import org.wecancodeit.reviews.repos.PhoneRepository;

import java.util.Optional;

@Controller
public class ManufacturerController {

    private ManufacturerRepository manufacturerRepo;
    private PhoneRepository phoneRepo;

    public ManufacturerController(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;
    }

    @RequestMapping("/manufacturers")
    public String listManufacturers() {
        return "manufacturer";
    }


}
