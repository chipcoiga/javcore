package com.jav.lhloc.lab26;

public class XaDap {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "XaDap{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public XaDap(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
