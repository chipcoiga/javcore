package com.jav.lhloc.lab8;

public class HocSinh extends HocSinhProcess{


    private String name;
    public static int age;
    public static void setAge(int age) {
        HocSinh.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class QuyLop {
        private int quyLop;

        public int getQuyLop() {
            return quyLop;
        }

        public void setQuyLop(int quyLop) {
            this.quyLop = quyLop;
        }
    }
}
