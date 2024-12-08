//package com.jav.hoang.BaiTap1;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.displayMenu();
//
//
//        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
//        int selectedOption;
//        do {
//            selectedOption = getSelectedOption();
//            switch (selectedOption) {
//                case 1:
//                    System.out.println("Go to: Add new item");
//                    LibraryItem item = inputNewItem();
//                    libraryManagementSystem.addItem(item);
//                    break;
//                case 2:
//                    System.out.println("Go to Display Item ");
//                    libraryManagementSystem.displayAllItem();
//                    break;
//                case 3:
//                    System.out.println("Go to search item");
//                    String searchText = inputSearchText();
//                    LibraryItem searchItem = libraryManagementSystem.searchItembytext(searchText);
//                    if (searchItem == null) {
//                        System.out.println("Item not found");
//                        break;
//                    }
//                    searchItem.displayInfo();
//                    break;
//                case 4:
//                    System.out.println("Remove item");
//                    String itemId = inputItemId();
//                    libraryManagementSystem.removeItem(itemId);
//                    break;
//                case 5:
//                    System.out.println("Go to : display item by type");
//                    Itemt type = inputItemType();
//                    libraryManagementSystem.displayItemByType(type);
//                    break;
//                case 6:
//                    System.out.println("Exit");
//                    break;
//            }
//        } while (selectedOption < 6);
//    }
//
//    private static Itemt inputItemType() {
//        System.out.println("Vui long chon loai item : 1. book , 2.dvd, 3.magazine");
//        Scanner scanner = new Scanner(System.in);
//        int selectedType = scanner.nextInt();
//        switch (selectedType) {
//            case 1:
//                return Itemt.BOOK;
//            case 2:
//                return Itemt.DVD;
//            case 3:
//                return Itemt.MAGAZINE;
//            default:
//                return null;
//        }
//
//    }
//    private static LibraryItem inputNewItem (){
//        System.out.println("Vui long chon loai item input");
//        Itemt typeInput = inputItemType();
//        switch (typeInput){
//            case BOOK:
//                return inputNewBook();
//            case DVD :
//                return inputNewDVD();
//            case MAGAZINE:
//                return inputNewMagazine();
//            default:
//                return null;
//        }
//
//    }
//    private  static String inputItemId(){
//        System.out.println("Vui long nhap item id");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//    private static String inputSearchText(){
//        System.out.println("Vui long nhap text");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextLine();
//    }
//    private static LibraryItem inputNewMagazine(){
//        System.out.println("Vui long nhap thong tin Magazine");
//        System.out.println("title");
//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        System.out.println("Item id:");
//        String itemId = scanner.nextLine();
//        System.out.println("Publisher:");
//        String publisher = scanner.nextLine();
//        System.out.println("Issue date (yyyy/MM/dd):");
//        String issueDate = scanner.nextLine();
//        LocalDate localDate = LocalDate.parse(issueDate, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
//        return new Magazine(title,itemId,publisher,localDate);
//
//
//
//    }
//    private static LibraryItem inputNewDVD() {
//        System.out.println("Vui long nhap thong tin DVD:");
//        System.out.println("Title:");
//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        System.out.println("Item id:");
//        String itemId = scanner.nextLine();
//        System.out.println("Duration:");
//        int duration = scanner.nextInt();
//        System.out.println("Director:");
//        String director = scanner.nextLine();
//        System.out.println("Thank you for input DVD");
//        return new DVD(title,itemId,duration,director);
//    }
//    private static LibraryItem inputNewBook() {
//        System.out.println("Vui long nhap thong tin Book:");
//        System.out.println("Title:");
//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        System.out.println("Item id:");
//        String itemId = scanner.nextLine();
//        System.out.println("Author:");
//        String author = scanner.nextLine();
//        System.out.println("Public year:");
//        int publicYear = scanner.nextInt();
//        System.out.println("Thank you for input Book");
//        return  new Book(title,itemId,author,publicYear);
//    }
//    private static int getSelectedOption(){
//        System.out.println("Vui long chon option");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextInt();
//    }
//    public void displayMenu(){
//        System.out.println("1. Add new item");
//        System.out.println("2. Display all items");
//        System.out.println("3. Search item");
//        System.out.println("4. Remove item");
//        System.out.println("5. Display items by type");
//        System.out.println("6. Exit");
//    }
//}
