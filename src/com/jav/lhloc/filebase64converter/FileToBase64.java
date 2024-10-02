package com.jav.lhloc.filebase64converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class FileToBase64 {
    public static String convertExcelToBase64(String filePath) throws IOException {
        File file = new File(filePath);
        byte[] bytes = new byte[(int) file.length()];

        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(bytes);
        }

        return Base64.getEncoder().encodeToString(bytes);
    }

    public static void saveBase64ToTxtFile(String base64String, String outputPath) throws IOException {
        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write(base64String);
        }
    }

    public static void main(String[] args) {
        try {
            String excelFilePath = "path/to/your/excel/file.xlsx";
            String txtOutputPath = "path/to/output/base64_output.txt";

            String base64String = convertExcelToBase64(excelFilePath);
            saveBase64ToTxtFile(base64String, txtOutputPath);

            System.out.println("Base64 string has been saved to: " + txtOutputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
