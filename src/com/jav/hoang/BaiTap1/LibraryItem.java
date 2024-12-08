package com.jav.hoang.BaiTap1;

import com.jav.lhloc.lab27.ItemType;

public abstract class LibraryItem {
    private String title;
    private String id;

    public LibraryItem(String title, String id){
        this.title = title;
        this.id = id ;
    }

    public abstract void displayInfo();
    public abstract Itemt getType();

    public String getTitle() {
        return title;
    }
    public String getId() {
        return id;
    }
}
