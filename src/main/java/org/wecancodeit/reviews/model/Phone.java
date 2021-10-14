package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
    @ManyToOne
    private Manufacturer manufacturer;
    private PricePoint pricePoint;
    private PhoneType type;


public Phone(String name, PhoneType phoneType,  Manufacturer manufacturer, PricePoint pricePoint) {
        this.name = name;
        this.type = phoneType;
        this.manufacturer = manufacturer;
        this.pricePoint = pricePoint;
    }

    public PhoneType getType() {
        return type;
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

}
