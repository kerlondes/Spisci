package com.example.tupovseeto;

public class Product {
    private final String name;
    private final String description;
    private int count;
    private final String unit;
    private int imageResource;


    Product(String name, String unit, String description, int imageResource){
        this.name = name;
        this.description = description;
        this.count=0;
        this.unit = unit;
        this.imageResource = imageResource;

    }
    public String getUnit() {
        return this.unit;
    }
    public String getDescript() {
        return this.description;
    }
    public int getImage() {
        return this.imageResource;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public String getName(){
        return this.name;
    }
}