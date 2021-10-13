package org.wecancodeit.repos;

import org.wecancodeit.reviews.Phone;

public class Populator {
    private ManufacturerRepository manufacturerRepo;
    private PhoneRepository phoneRepo;
    private PhoneListRepository phoneListRepo;

    public Populator(ManufacturerRepository manufacturerRepo, PhoneRepository phoneRepo, PhoneListRepository phoneListRepo) {
        this.manufacturerRepo = manufacturerRepo;
        this.phoneRepo = phoneRepo;
        this.phoneListRepo = phoneListRepo;
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Manufacturer Samsung = new Manufacturer("Samsung", "US", "Z-Flip");
//        Manufacturer Apple = new Manufacturer("Apple", "US", "iPhone 12 Pro Max");
//        Manufacturer Motorola = new Manufacturer("Motorola","US", "Razr");

        Phone phone1 = new Phone("Samsung", "Flip Phone", "Z-Flip","Samsung","$$$");
        Phone phone2 = new Phone("Apple","Smart Phone", "iPhone 12 Pro Max", "Apple", "$$$$");
        Phone phone3 = new Phone("Motorola", "Flip Phone", "Razr", "Motorola","$$");



    }



