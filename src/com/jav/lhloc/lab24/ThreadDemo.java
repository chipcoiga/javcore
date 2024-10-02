package com.jav.lhloc.lab24;

public class ThreadDemo implements Runnable {

    SinhVien[] sinhViens;
    String threadName;

    public ThreadDemo(SinhVien[] sinhViens, String threadName) {
        this.sinhViens = sinhViens;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < sinhViens.length; i++) {
            if (sinhViens[i] != null) {
                System.out.println(threadName + ": " + sinhViens[i]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
