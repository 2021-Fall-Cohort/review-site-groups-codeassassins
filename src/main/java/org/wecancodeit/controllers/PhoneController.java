package org.wecancodeit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 @Controller
public class PhoneController {


        @RequestMapping("/")
        public String getPhoneList() {
            return "PhoneList";
        }
 }
