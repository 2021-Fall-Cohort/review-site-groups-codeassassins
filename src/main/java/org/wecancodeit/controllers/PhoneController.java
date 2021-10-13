package org.wecancodeit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.Manufacturer;
import org.wecancodeit.reviews.Phone;
import org.wecancodeit.reviews.PhoneList;

@Controller
public class PhoneController {

     private Manufacturer manufacturer;
     private Phone phone;
     private PhoneList phonelist;

    public PhoneController(Manufacturer manufacturer, Phone phone, PhoneList phonelist) {
        this.manufacturer = manufacturer;
        this.phone = phone;
        this.phonelist = phonelist;
    }

    @RequestMapping("/")
        public String getPhoneList() {
            return "PhoneList";
        }
 }

