package com.jav.lhloc.lab25;

public enum DayOfWeek {
    MONDAY("日本語", 1),
    TUESDAY("THU BA", 2),
    WEDNESDAY("THU TU", 3),
    THURSDAY("THU NAM", 4),
    FRIDAY("THU SAU", 5),
    SATURDAY("THU BAY", 6),
    SUNDAY("CHU NHAT", 7);

    private final String vietnamese;
    private final int index;

    DayOfWeek(String vietnamese, int index) {
        this.vietnamese = vietnamese;
        this.index = index;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public int getIndex() {
        return index;
    }
}
