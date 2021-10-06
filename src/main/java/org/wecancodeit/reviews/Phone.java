package org.wecancodeit.reviews;

public class Phone {
    private String brand;
    private String type;
    private String name;
    private String manufacturer;
    private String pricePoint;



    public Phone(String brand, String type, String name, String manufacturer, String pricePoint) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.pricePoint = pricePoint;
    }

    public String getBrand() {

        return brand;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPricePoint() {
        return pricePoint;
    }

    public String getName() {
        return name;
    }
}
