package com.example.foodapp.models;

public class mainModel {
   int image ;
   String name,price, description;

    public mainModel(int image,String name,String price,String description) {
       this.image = image
        this.name = name;
        this.price =price;
        this.description =description
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
