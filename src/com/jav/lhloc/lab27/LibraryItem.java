package com.jav.lhloc.lab27;

public abstract class LibraryItem {
    private String title;
    private String itemId;

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    public abstract void displayInfo();
    public abstract ItemType getType();

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }
}
