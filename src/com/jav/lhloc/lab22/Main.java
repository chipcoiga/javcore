package com.jav.lhloc.lab22;

public class Main {
    public static void main(String[] args) {

        try {
            extracted(10, 0);
        } catch (DemoException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkPassword("123", "123");
        } catch (PasswordMissMatchException e) {
            
        }

        System.out.println("tiep tu chuong trinh ....");
    }

    private static void extracted(int a, int b) throws DemoException {

        if (b == 0) {
            throw new DemoException("Loi chia cho 0");
        }
        System.out.println(div(a, b));
    }

    private static int div(int a, int b) {
        return a/b;
    }

    private static void checkPassword(String password, String rePassword)
            throws PasswordMissMatchException {

        if (password.equals(rePassword)) {
            System.out.println("Password matched");
        } else {
            throw new PasswordMissMatchException("Password not matched");
        }
    }
}
