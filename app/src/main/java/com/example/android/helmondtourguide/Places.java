package com.example.android.helmondtourguide;

public class Places {
    private static final int NO_IMAGE_PROVIDED = -1;

    private String name;
    private String info;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private String price = null;

    public Places(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public Places(String name, String info, String price) {
        this.name = name;
        this.info = info;
        this.price = price;
    }

    public Places(String name, String info, int imageResourceId) {
        this.name = name;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }

    public Places(String name, String info, String price, int imageResourceId) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getPrice() {
        return price;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasPrice() {
        return price != null;
    }
}
