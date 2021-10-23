package org.wecancodeit.reviews.controllers;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.repos.HashtagRepository;
import org.wecancodeit.reviews.repos.ManufacturerRepository;
import org.wecancodeit.reviews.repos.PhoneRepository;

@Controller
public class HashtagController {
    private HashtagRepository hashtagRepo;
    private PhoneRepository phoneRepo;
    private ManufacturerRepository manufacturerRepo;

    public HashtagController( ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo, HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;

    }

    @RequestMapping("/hashtags")
    public String getPhoneHashtag(Model model) {
        model.addAttribute("hashtag", hashtagRepo.findAll());
        model.addAttribute("phone", phoneRepo.findAll());

        return "hashtags";
    }

    @RequestMapping("/hashtag/phones/{name}")
    public String listPhonesAttachedToHashtag(Model model, @PathVariable String name) {
        model.addAttribute("hashtag", hashtagRepo.findByNameIgnoreCase(name).get());
        model.addAttribute("phone", phoneRepo.findAll());

        return "hashtag";
    }



}
