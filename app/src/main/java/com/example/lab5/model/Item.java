package com.example.lab5.model;

public class Item {
    private int id;
    private String name;
    private String gia;

    public Item(int id, String name, String gia) {
        this.id = id;
        this.name = name;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
