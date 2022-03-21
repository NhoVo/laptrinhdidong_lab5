package com.example.lab5.model;

public class Item {
   private int id;
   private int img;
   private String names;
   private String price;

    public Item(int id, int img, String names, String price) {
        this.id = id;
        this.img = img;
        this.names = names;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
