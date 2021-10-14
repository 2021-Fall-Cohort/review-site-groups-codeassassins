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

        Phone phone1 = new Phone("Z-Flip", Phone.PhoneType.SMART_FLIP,samsung,Phone.PricePoint.$$$);
        phoneRepo.save(phone1);
        //Phone phone2 = new Phone("Apple", "Smart Phone", "iPhone 12 Pro Max", "Apple", "$$$$");
        //Phone phone3 = new Phone("Motorola", "Flip Phone", "Razr", "Motorola", "$$");


    }
}



