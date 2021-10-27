package org.wecancodeit.reviews.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Phone {

    public enum PhoneType{
        FLIP,
        SMART,
        BRICK,
        FABLET,
        SMART_FLIP
    }
    public enum PricePoint{
        $,
        $$,
        $$$,
        $$$$
    }

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    @ManyToOne
    private Manufacturer manufacturer;
    private PricePoint pricePoint;
    private PhoneType type;
    private String imgUrl;
    @ElementCollection
    private Collection<String> comments;

    @ManyToMany
    private Collection<Hashtag> hashtags;

    public Phone(String name, PhoneType phoneType,  String description, Manufacturer manufacturer, PricePoint pricePoint, String imgUrl, Hashtag...hashtags) {
        this.name = name;
        this.type = phoneType;
        this.description = description;
        this.manufacturer = manufacturer;
        this.pricePoint = pricePoint;
        this.imgUrl = imgUrl;
        this.hashtags = Arrays.asList(hashtags);
        this.comments = new ArrayList<String>();


    }

    public Phone() {

    }

    public PhoneType getType() {

    return type;
    }

    public String getImgUrl() {

    return imgUrl;
    }

    public String getDescription() {

    return description;
    }

    public Manufacturer getManufacturer() {

    return manufacturer;
    }

    public PricePoint getPricePoint() {

    return pricePoint;
    }



    public String getName() {

    return name;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public long getId() {
        return id;
    }

    public void addHashtag(Hashtag hashtag){
        hashtags.add(hashtag);
    }

    public Collection<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Phone phone = (Phone) p;
        return id == phone.id && Objects.equals(name, phone.name) && Objects.equals(description, phone.description) && Objects.equals(manufacturer, phone.manufacturer) && Objects.equals(pricePoint, phone.pricePoint) && Objects.equals(imgUrl, phone.imgUrl);
    }

    @Override
    public int hashCode() {
    return Objects.hash(id, name, description, pricePoint, imgUrl );

}



}
