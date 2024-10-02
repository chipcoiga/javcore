package com.jav.lhloc.models;

import java.time.LocalDate;

public class Nguoi {
    String name = "Loi input qua 255 ki tu";
    String gender = "Nam";
    LocalDate birthday;
    int hight;
    int weight;

    private Nguoi(){}

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {

        int count = 0; //co the thay doi

        if (birthday.isAfter(LocalDate.now())) {
            System.out.println("Ngay sinh khong hop le");
        } else {
            this.birthday = birthday;
        }
//        this.birthday = birthday;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
