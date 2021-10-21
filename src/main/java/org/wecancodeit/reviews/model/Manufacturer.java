package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String location;
    private String logoUrl;
    @OneToMany(mappedBy = "manufacturer")
    Collection<Phone> phones;


    public Manufacturer(String name, String location, String logoUrl) {
        this.name = name;
        this.location = location;
        this.logoUrl = logoUrl;
//        this.phones = new ArrayList<Phone>();

    }

    public Manufacturer() {

    }


    public String getName() {
        return name;
    }

    public Collection<Phone> getPhones() {
        return phones;
    }

    public long getId() {
        return id;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getLocation() {
        return location;
    }

    public Manufacturer(Manufacturer manufacturer) {
    }


    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Manufacturer manufacturer = (Manufacturer) p;
        return id == manufacturer.id && Objects.equals(id, manufacturer.id) && Objects.equals(name, manufacturer.name) && Objects.equals(location, manufacturer.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location);


    }
}
