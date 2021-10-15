package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
@Entity
public class Manufacturer {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String location;
    @OneToMany(mappedBy = "manufacturer")
    Collection<Phone> phones;


    public Manufacturer(String name, String location) {
        this.name = name;
        this.location = location;
        this.phones = new ArrayList<Phone>();

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Manufacturer(Manufacturer manufacturer) {
    }


//    public void addPhone(Phone phone) {
//
//        phones.add(phone);
//    }





}
