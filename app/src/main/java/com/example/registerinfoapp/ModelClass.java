package com.example.registerinfoapp;

public class ModelClass {
    private String imageUrl;

    public ModelClass() {
    }

    public ModelClass(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
