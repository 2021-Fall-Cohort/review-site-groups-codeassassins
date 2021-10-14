package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repos.ManufacturerRepository;
import org.wecancodeit.reviews.repos.PhoneRepository;

@Controller
public class PhoneController {

     private ManufacturerRepository manufacturerRepo;
     private PhoneRepository phoneRepo;

    public PhoneController(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;
    }

    @RequestMapping("/")
        public String getPhoneList() {
        return "PhoneList";
        }
 }

