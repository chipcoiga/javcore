package com.jav.hoang.LuyenTap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception extends Throwable {
    public static void main(String[] args)  {
        String ten = null;
        doDaiString (ten);
        try {
            docFile("text");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doDaiString (String chuoi) throws TenTrongKhongException,NullPointerException{
        if (chuoi == null){
            throw new TenTrongKhongException("Chuoi khong duoc null dau ay oi");
        }
        System.out.println("do dai cua chuoi la " + chuoi.length());

}
public static void docFile(String fileName) throws FileNotFoundException {
    FileReader red = new FileReader(fileName);
}

}
