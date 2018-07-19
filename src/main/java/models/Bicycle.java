package models;

import models.enums.Category;

public class Bicycle extends Advert {

    private int wheelSize;
    private int minAge;
    private int maxAge;

    public Bicycle() {}

    public Bicycle(String title, String description, int price, String imageUrl, User user, int wheelSize, int minAge, int maxAge) {
        super(title, description, price, Category.BICYCLE, imageUrl, user);
        this.minAge = minAge;
        this.maxAge = maxAge;
    }


}
