package com.jav.lhloc.lab24;

public class MainTest {
    public static void main(String[] args) {
        SinhVien[] sinhViens1 = new SinhVien[5];
        sinhViens1[0] = new SinhVien("Nguyen Van A", "1");
        sinhViens1[1] = new SinhVien("Nguyen Van B", "2");
        sinhViens1[2] = new SinhVien("Nguyen Van C", "3");
        sinhViens1[3] = new SinhVien("Nguyen Van D", "4");
        sinhViens1[4] = new SinhVien("Nguyen Van E", "5");

        SinhVien[] sinhViens2 = new SinhVien[5];
        sinhViens2[0] = new SinhVien("Nguyen Van F", "6");
        sinhViens2[1] = new SinhVien("Nguyen Van G", "7");
        sinhViens2[2] = new SinhVien("Nguyen Van H", "8");
        sinhViens2[3] = new SinhVien("Nguyen Van I", "9");
        sinhViens2[4] = new SinhVien("Nguyen Van K", "10");

        ThreadDemo thread1 = new ThreadDemo(sinhViens1, "Thread 1");
        ThreadDemo thread2 = new ThreadDemo(sinhViens2, "Thread 2");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}
/**
 Thread 1: NhanVien{name='Nguyen Van A', id='1'}
 Thread 2: NhanVien{name='Nguyen Van F', id='6'}
 Thread 2: NhanVien{name='Nguyen Van G', id='7'}
 Thread 1: NhanVien{name='Nguyen Van B', id='2'}
 Thread 2: NhanVien{name='Nguyen Van H', id='8'}
 Thread 1: NhanVien{name='Nguyen Van C', id='3'}
 Thread 1: NhanVien{name='Nguyen Van D', id='4'}
 Thread 2: NhanVien{name='Nguyen Van I', id='9'}
 Thread 1: NhanVien{name='Nguyen Van E', id='5'}
 Thread 2: NhanVien{name='Nguyen Van K', id='10'}
 */
/**
 Thread 2: NhanVien{name='Nguyen Van F', id='6'}
 Thread 1: NhanVien{name='Nguyen Van A', id='1'}
 Thread 2: NhanVien{name='Nguyen Van G', id='7'}
 Thread 1: NhanVien{name='Nguyen Van B', id='2'}
 Thread 1: NhanVien{name='Nguyen Van C', id='3'}
 Thread 2: NhanVien{name='Nguyen Van H', id='8'}
 Thread 1: NhanVien{name='Nguyen Van D', id='4'}
 Thread 2: NhanVien{name='Nguyen Van I', id='9'}
 Thread 1: NhanVien{name='Nguyen Van E', id='5'}
 Thread 2: NhanVien{name='Nguyen Van K', id='10'}
 */
