package com.jav.lhloc.lab25;

import java.util.List;

import static com.jav.lhloc.lab25.PaymentStatus.PAID;
import static com.jav.lhloc.lab25.PaymentStatus.WAITING;
import static com.jav.lhloc.lab25.StaticMethod.print;

public class Process {
    public static void main(String[] args) {
//        printDayPart(DayOfWeek.MONDAY);
//        printDayPart(DayOfWeek.TUESDAY);
//        printDayPart(DayOfWeek.WEDNESDAY);
//        printDayPart(DayOfWeek.THURSDAY);
//        printDayOfWeek(DayOfWeekString.MONDAY);
//        printDayOfWeek(DayOfWeekString.THURSDAY);
//        System.out.println(DayOfWeek.MONDAY.name());
//
//        int a = 1;
//        Integer n = null;
//        printDayPart((Integer) null);

        printPaymentStatus(WAITING);
        printPaymentStatus(PAID);
        printPaymentStatus(PAID);

        print(PAID);

        print(PAID);
    }

    public static void printPaymentStatus(PaymentStatus paymentStatus) {
        System.out.println(paymentStatus);
    }

    public static void printDayPart(Integer dayOfWeek) {
        System.out.println(dayOfWeek);
    }

    public static void printDayPart(List<DayOfWeek> dayOfWeeks) {

        DayOfWeek x = dayOfWeeks.get(0);

        System.out.println(x.getVietnamese());
        System.out.println(x.getIndex());
    }

    public static void printDayOfWeek(String dayOfWeek) {
        System.out.println(dayOfWeek);
    }
}

enum DayOfWeekString {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
