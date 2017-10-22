package com.a3torstudio.coffeina;

/**
 * Created by Marcin on 21.10.2017.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Late","Czarne espresso z gorącym mlekiem i mleczną pianką.", R.drawable.latte),
            new Drink("Cappuccino","Czarne espresso z dużą ilością spienionego mleka", R.drawable.cappuccino),
            new Drink("Espresso","Czarna kawa ze świeżo mielonych ziaren.", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
