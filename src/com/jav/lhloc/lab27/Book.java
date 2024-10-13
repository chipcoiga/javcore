package com.jav.lhloc.lab27;

public class Book extends LibraryItem {
    private String author;
    private int publicYear;

    public Book(String title, String itemId, String author, int publicYear) {
        super(title, itemId);
        this.author = author;
        this.publicYear = publicYear;
    }

    @Override
    public void displayInfo() {
        String info = "Book{" +
                "author='" + author + '\'' +
                ", publicYear=" + publicYear +
                ", title=" + super.getTitle() +
                ", itemId=" + super.getItemId() +
                ", Type=" + getType().name() +
                '}';

        System.out.println(info);
    }

    @Override
    public ItemType getType() {
        return ItemType.BOOK;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicYear() {
        return publicYear;
    }
}
