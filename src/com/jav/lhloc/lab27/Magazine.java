package com.jav.lhloc.lab27;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Magazine extends LibraryItem {
    private String publisher;
    private LocalDate issueDate;

    public Magazine(String title, String itemId, String publisher, LocalDate issueDate) {
        super(title, itemId);
        this.publisher = publisher;
        this.issueDate = issueDate;
    }

    @Override
    public void displayInfo() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String info = "Magazine{" +
                "publisher='" + publisher + '\'' +
                ", issueDate=" + issueDate.format(formatter) +
                ", title=" + super.getTitle() +
                ", itemId=" + super.getItemId() +
                ", Type=" + getType().name() +
                '}';

        System.out.println(info);
    }

    @Override
    public ItemType getType() {
        return ItemType.MAGAZINE;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }
}
