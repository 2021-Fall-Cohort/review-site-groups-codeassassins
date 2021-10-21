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
public class PhoneController {

     private ManufacturerRepository manufacturerRepo;
     private PhoneRepository phoneRepo;


    public PhoneController(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;

    }

    @RequestMapping("/phones")
    public String listPhones(Model model) {
        model.addAttribute("phone", phoneRepo.findAll());
        return "phones";
    }

    @RequestMapping("/phones/{name}")
    public String showPhone(Model model, @PathVariable String name){
        model.addAttribute("phone", phoneRepo.findByName(name));
        return "phone";
    }

    @RequestMapping("/home")
    public String showHome(Model model){

        return "index";
    }

    
    @PostMapping("/add")
    public String addPhone(@RequestParam String name, @RequestParam String description, @RequestParam Phone.PhoneType phoneType, @RequestParam Manufacturer manufacturer, Phone.PricePoint pricePoint, @RequestParam String imgUrl) {
        Manufacturer manufacturer1;
        Optional<Manufacturer> manuOpt = manufacturerRepo.findByName(manufacturer);
        if(manuOpt.isEmpty()){
            manufacturer1 = new Manufacturer(manufacturer);
            manufacturerRepo.save(manufacturer1);
        }
        else {
            manufacturer1 = manuOpt.get();
        }
        Phone newPhone = new Phone(name,  phoneType, description, manufacturer1, pricePoint, imgUrl);
        phoneRepo.save(newPhone);
        return "redirect:/Phones/";
    }
}

