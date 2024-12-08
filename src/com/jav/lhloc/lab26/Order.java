package com.jav.lhloc.lab26;

import com.jav.lhloc.lab5.SinhVien;
import com.jav.lhloc.lab71.SinhVienBiz;
import com.jav.lhloc.lab71.SinhVienPoly;

import java.util.ArrayList;

public class Order<T> {//Long, Int, Double, Float, Byte, Short
    private Long amount;
    private String buyerName;
    private T product;

    public void printObject(T obj) {
        //T => xedap => getPrice()
        //T => tivi => getPrice()X => getGia()
        System.out.println(obj);
    }

    public long getGiaSanPham(T obj) {
        boolean isXeDap = obj instanceof XaDap; //có phải obj là instance của XaDap không?
        if (isXeDap) { // nếu obj là instance của XaDap
            XaDap instance = (XaDap) obj; //ép kiểu obj về XaDap
            long giaSanPham = instance.getPrice(); //lấy giá sản phẩm
            return giaSanPham;
        }

        boolean isTivi = obj instanceof Tivi;
        if (isTivi) { // nếu obj là instance của Tivi
            Tivi instance = (Tivi) obj; //ép kiểu obj về Tivi
            long giaSanPham = instance.getGia(); //lấy giá sản phẩm
            return giaSanPham;
        }

        return 0L;
    }

    public static void main(String[] args) {
        Order order1 = new Order();//order1 gọi là instance của class Order
//        long gia = order1.getGiaSanPham(new XaDap("XaDap", 1000));
//        long gia = order1.getGiaSanPham(new Tivi("Sony", 1400));
        long gia = order1.getGiaSanPham(89969);
        System.out.println(gia);
//        order1.setAmount(1000L);
//        order1.setBuyerName("Hoang");
//        order1.setProduct(new XaDap("XaDap", 1000));
//        order1.printObject(new XaDap("XaDap", 1000));
//        order1.printObject(new Tivi("Sony", 1400));




//        Order order2 = new Order();
//        order2.setAmount(1000L);
//        order2.setBuyerName("Hoang");
//        order2.setProduct(new Tivi("Sony", 1400));
//
//        Order<Tivi> order3 = new Order<>();
//        order3.setProduct(new Tivi("Sony", 1400));
//
//        ArrayList arrayList = new ArrayList<>();
//        arrayList.add(order1);
//        arrayList.add(10L);
//        arrayList.add("Hello");
//
//        ArrayList<NhanVien> sinhViens = new ArrayList<>();
//        sinhViens.add(new NhanVien());
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        this.product = product;
    }
}


