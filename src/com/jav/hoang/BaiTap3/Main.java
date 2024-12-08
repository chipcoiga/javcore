package com.jav.hoang.BaiTap3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ProductManagement prdmn = new ProductManagement();

        Main main = new Main();

        int selectOption;

        do {
            HienThiMenu();
            selectOption = getSelectOption();
            switch (selectOption) {
                case 1:
                    System.out.println("1.VUI LONG INPUT THONG TIN ");
                    Product productitem = InputNewItem();
                    prdmn.addNewItem(productitem);
                    break;
                case 2:
                    System.out.println("2.XUAT THONG TIN  ");
                    prdmn.displayAll();
                    break;
                case 3:
                    System.out.println("3.DISPLAY ITEM THEO TYPE");
                    ProductCategory pr = inputItemType();
                    prdmn.getItemByType(pr);
                    break;
                case 4:
                    System.out.println("4.ADD ITEM CO SAN ");
                    Product itm = ItemCoSan();
                    prdmn.addNewItem(itm);
                    break;
            }
        } while (selectOption < 5);

    }


    private static ProductCategory inputItemType() {
        System.out.println("Vui long chon option : 1 . Electronic 2.Clothing");
        int select;
        Scanner scanner = new Scanner(System.in);
        select = scanner.nextInt();
        switch (select) {
            case 1:
                return ProductCategory.DIENMAY;
            case 2:
                return ProductCategory.QUANAO;

        }
        return null;
    }

    private static Product InputNewItem() {
        ProductCategory prd = inputItemType();
        switch (prd) {
            case DIENMAY:
                return CreateNewElectronic();
            case QUANAO:
                return CreateNewClothing();
            default:
                return null;
        }
    }

    private static Product CreateNewClothing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id ");
        int id = scanner.nextInt();
        System.out.println("Nhap gia ");
        double gia = scanner.nextDouble();
        System.out.println("nhap loai sp ");
        String loaiSP = scanner.nextLine();
        System.out.println("nhap hang thoi trang ");
        String hangThoiTrang = scanner.nextLine();
        System.out.println("nhap size ");
        double size = scanner.nextDouble();
        return new Clothing(id, gia, loaiSP, hangThoiTrang, size);
    }


    private static Product CreateNewElectronic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id ");
        int id = scanner.nextInt();
        System.out.println("Nhap gia ");
        double gia = scanner.nextDouble();
        System.out.println("nhap loai sp ");
        String loaiSP = scanner.nextLine();
        System.out.println("nhap kieu dang ");
        String kieudang = scanner.nextLine();
        System.out.println("nhap so luong ");
        int soluong = scanner.nextInt();

        return new Electronics(id, gia, loaiSP, kieudang, soluong);
    }

    private static int getSelectOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void HienThiMenu() {
        System.out.println("Vui Long Chon option nhu sau :");
        System.out.println("1.Input Thong Tin");
        System.out.println("2.Xuat ra thong tin");
        System.out.println("3.Display Item theo type");
        System.out.println("4.Add item co san ");
        System.out.println("5.Exit");
    }

    private static Product ItemCoSan() {
        ProductCategory prd = inputItemType();
        switch (prd) {
            case DIENMAY:
                System.out.println("Add san pham : ID 22, GIA: 330.000, LOAI SP :MAY GIAT, KIEU DANG :CUA NAM, SO LUONG : 1");
                return CreateItemElectricCoSan();
            case QUANAO:
                System.out.println(("Add san pham : ID 11, GIA: 20.000, LOAI SP :Uniqlo, KIEU DANG :Ao Phong, SO LUONG : 1"));
                return CreateClothingCoSan();
            default:
                return null;

        }
    }

    private static Product CreateItemElectricCoSan() {
        return new Electronics(22, 330.000, "MAY GIAT", "CUA NAM", 1);

    }

    private static Product CreateClothingCoSan() {
        return new Electronics(11, 20.000, "Uniqlo", "Ao Phong", 1);


    }
}