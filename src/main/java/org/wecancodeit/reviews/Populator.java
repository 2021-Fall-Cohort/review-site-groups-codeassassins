package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.model.Manufacturer;
import org.wecancodeit.reviews.model.Phone;
import org.wecancodeit.reviews.repos.ManufacturerRepository;
import org.wecancodeit.reviews.repos.PhoneRepository;

@Component
public class Populator implements CommandLineRunner {
    private ManufacturerRepository manufacturerRepo;
    private PhoneRepository phoneRepo;

    public Populator(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Manufacturer samsung = new Manufacturer("Samsung", "US");
        manufacturerRepo.save(samsung);
        Manufacturer apple = new Manufacturer("Apple", "US");
        manufacturerRepo.save(apple);
        Manufacturer motorola = new Manufacturer("Motorola", "US");
        manufacturerRepo.save(motorola);

        Phone phone1 = new Phone("Z-Flip", Phone.PhoneType.SMART_FLIP,"Samsung's latest foray into flip phones",samsung,Phone.PricePoint.$$$,"/images/z_flip.jpg");
        phoneRepo.save(phone1);
        Phone phone2 = new Phone("iPhone 13 Max", Phone.PhoneType.SMART, "Apple's newest, latest and greatest!", apple, Phone.PricePoint.$$$$,"/images/iphone_13.png");
        phoneRepo.save(phone2);
        Phone phone3 = new Phone("Razr", Phone.PhoneType.SMART_FLIP, "Just because we can, doesn't mean you should....", motorola, Phone.PricePoint.$,"/images/razr.jpg");
        phoneRepo.save(phone3);

        


    }
}



