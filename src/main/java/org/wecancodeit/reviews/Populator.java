package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.model.Hashtag;
import org.wecancodeit.reviews.model.Manufacturer;
import org.wecancodeit.reviews.model.Phone;
import org.wecancodeit.reviews.repos.HashtagRepository;
import org.wecancodeit.reviews.repos.ManufacturerRepository;
import org.wecancodeit.reviews.repos.PhoneRepository;

@Component
public class Populator implements CommandLineRunner {
    private ManufacturerRepository manufacturerRepo;
    private PhoneRepository phoneRepo;
    private HashtagRepository hashtagRepo;

    public Populator(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo, HashtagRepository hashtagRepo ) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Manufacturer samsung = new Manufacturer("Samsung", "US", "./images/Samsung.png");
        manufacturerRepo.save(samsung);
        Manufacturer apple = new Manufacturer("Apple", "US","./images/Apple.png");
        manufacturerRepo.save(apple);
        Manufacturer motorola = new Manufacturer("Motorola", "US","./images/Motorola-Logo-1.png");
        manufacturerRepo.save(motorola);

        Hashtag hashtag1 = new Hashtag("Great camera");
        hashtagRepo.save(hashtag1);

        Phone phone1 = new Phone("Z-Flip", Phone.PhoneType.SMART_FLIP,"Samsung's latest foray into flip phones",samsung,Phone.PricePoint.$$$,"/images/z_flip.jpg");
        Phone phone2 = new Phone("iPhone 13 Max", Phone.PhoneType.SMART, "Apple's newest, latest and greatest!", apple, Phone.PricePoint.$$$$,"/images/iphone_13.png", hashtag1);
        Phone phone3 = new Phone("Razr", Phone.PhoneType.SMART_FLIP, "Just because we can, doesn't mean you should....", motorola, Phone.PricePoint.$,"/images/razr.jpg");
        //phone3.addHashtag(hashtag1);
        phoneRepo.save(phone1);
        phoneRepo.save(phone2);
        phoneRepo.save(phone3);



        phoneRepo.save(phone1);
        phoneRepo.save(phone2);
        phoneRepo.save(phone3);

        


    }
}



