package org.wecancodeit.reviews;

import java.util.Arrays;
import java.util.Collection;

public class Manufacturer {
    private String name;
    private String location;

    Collection<Phone> phones;

    public Manufacturer(String name, String location,  Phone... phoneModels) {
        this.name = name;
        this.location = location;
        this.phones = Arrays.asList(phoneModels);

    }

    public void addPhone(Phone phone) {

        phones.add(phone);
    }





}
