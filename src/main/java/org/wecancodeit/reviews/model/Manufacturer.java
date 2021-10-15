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

<<<<<<< HEAD
    public String getName() {
        return name;
    }
=======
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




>>>>>>> 65e9cf231d3581e1f75c8fb5119fb3d37efe39f8

    public String getLocation() {
        return location;
    }
}
