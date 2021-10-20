package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToMany(mappedBy = "hashtags")
    private Collection<Phone> phones;

    public Hashtag(String name, Phone...phones) {
        this.name = name;
        //this.phones = new ArrayList<Phone>();
        this.phones= List.of(phones);
        this.phones= Arrays.asList(phones);
    }

    public Hashtag() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Phone> getPhones() {
        return phones;
    }
}