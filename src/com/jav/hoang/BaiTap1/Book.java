package com.jav.hoang.BaiTap1;

public class Book extends LibraryItem{
    String author;
    int publicYear;
    public Book(String title , String id, String author ,int publicYear){
        super(title,id);
        this.author = author;
        this.publicYear = publicYear;

    }

    @Override
    public void displayInfo() {
        String info = "author{" + author +
                  "publicYear" + publicYear +
                "title " + super.getTitle() +
                "id " + super.getId() +
                "type " + getType().name();
        System.out.println(info);
    }

    @Override
    public Itemt getType() {
        return Itemt.BOOK;
    }
}
