package com.example.coursework.models;

public class HomeVerModel {
    int imagee;
    String name;

    String rating;

    String timing;

    String price;

    public HomeVerModel(int imagee, String name, String rating, String timing, String price) {
        this.imagee = imagee;
        this.name = name;
        this.rating = rating;
        this.timing = timing;
        this.price = price;
    }

    public int getImagee() {
        return imagee;
    }

    public void setImagee(int imagee) {
        this.imagee = imagee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
