package com.jav.lhloc.filebase64converter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Base64ToFile {
    public static void convertBase64ToFile(String base64FilePath, String outputPath) throws IOException {
        // Đọc chuỗi base64 từ file
        String base64String = new String(Files.readAllBytes(Paths.get(base64FilePath)));

        // Giải mã chuỗi base64
        byte[] decodedBytes = Base64.getDecoder().decode(base64String);

        // Ghi bytes vào file Excel
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            fos.write(decodedBytes);
        }
    }

    public static void main(String[] args) {
        String base64FilePath = "resources/base64_2.txt";
        String excelOutputPath = "resources/base64_2.xlsx";

        try {
            convertBase64ToFile(base64FilePath, excelOutputPath);
            System.out.println("File Excel đã được tạo thành công tại: " + excelOutputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
