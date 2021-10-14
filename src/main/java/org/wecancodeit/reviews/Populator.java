package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.wecancodeit.reviews.model.Manufacturer;
import org.wecancodeit.reviews.model.Phone;
import org.wecancodeit.reviews.repos.ManufacturerRepository;
import org.wecancodeit.reviews.repos.PhoneRepository;


public class Populator implements CommandLineRunner {
    private ManufacturerRepository manufacturerRepo;
    private PhoneRepository phoneRepo;

    public Populator(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Manufacturer Samsung = new Manufacturer("Samsung", "US");
        Manufacturer Apple = new Manufacturer("Apple", "US");
        Manufacturer Motorola = new Manufacturer("Motorola", "US");

        Phone phone1 = new Phone("Z-Flip", Phone.PhoneType.SMART_FLIP,Samsung,Phone.PricePoint.$$$);
        //Phone phone2 = new Phone("Apple", "Smart Phone", "iPhone 12 Pro Max", "Apple", "$$$$");
        //Phone phone3 = new Phone("Motorola", "Flip Phone", "Razr", "Motorola", "$$");


    }
}



