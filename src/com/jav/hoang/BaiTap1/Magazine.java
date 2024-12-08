package com.jav.hoang.BaiTap1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Magazine extends LibraryItem{
    private String puslisher;
    private LocalDate issueDate;

    public Magazine (String title,String id,String puslisher,LocalDate issueDate){
        super(title,id);
        this.puslisher = puslisher;
        this.issueDate = issueDate;
    }

    @Override
    public void displayInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String display =  "Magazine{" +
                "puslisher='" + puslisher + '\'' +
                ", issueDate=" + issueDate.format(fmt) +
                        "Title" +super.getTitle() +
                        "id"+super.getId()+
                        "type" + getType().name() +
                '}';
        System.out.println(display);
    }


    @Override
    public Itemt getType() {
        return Itemt.MAGAZINE;
    }


}
