package com.jav.lhloc.lab210.current;

public class LopCount {
    private String lop;
    private int count;

    public LopCount(String lop, int count) {
        this.lop = lop;
        this.count = count;
    }

    public String getLop() {
        return lop;
    }

    public int getCount() {
        return count;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
