package com.example.maryamch.github;

/**
 * Created by abbas on 5/13/2016.
 */
public class Product {

    String name;
    int image;

    public Product() {
    }

    public Product(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
