package com.jav.lhloc.lab23;

import com.jav.lhloc.lab71.SinhVienIT;
import com.jav.lhloc.lab71.SinhVienPoly;

import java.io.*;
import java.util.Scanner;

public class FileProcess {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "src/com/jav/lhloc/lab23/MyFile.dat";
        FileProcess fileProcess = new FileProcess();

        SinhVienPoly[] sinhVienPolies = new SinhVienPoly[5];
        sinhVienPolies[0] = new SinhVienIT("A", 10, 10, 10);
        sinhVienPolies[1] = new SinhVienIT("b", 10, 10, 10);
        sinhVienPolies[2] = new SinhVienIT("c", 10, 10, 10);
        sinhVienPolies[3] = new SinhVienIT("d", 10, 10, 10);
        sinhVienPolies[4] = new SinhVienIT("e", 10, 10, 10);

//        fileProcess.writeFile(fileName, sinhVienPolies);

        fileProcess.readFile(fileName);

        int a = 5;
        Integer b = a;

    }

    private void readFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileIO = new FileInputStream(fileName);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileIO);

        SinhVienPoly[] sinhVienPolies = (SinhVienPoly[]) objectInputStream.readObject();

        for (SinhVienPoly sinhVienPoly : sinhVienPolies) {
            System.out.println(sinhVienPoly.getHoTen());
            System.out.println(sinhVienPoly.getHocLuc());
            System.out.println(sinhVienPoly.getDiem());
        }

    }

    private void writeFile(String fileName, SinhVienPoly[] sinhVienPolies) throws IOException {
        FileOutputStream fileIO = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileIO);//SinhVienPoly
        objectOutputStream.writeObject(sinhVienPolies);
        objectOutputStream.close();
        fileIO.close();
    }
}
