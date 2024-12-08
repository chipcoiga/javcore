package com.jav.hoang.BaiTap1;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    List<LibraryItem> items = new ArrayList<>();

    public void addItem (LibraryItem item){
        items.add(item);
    }
    public void removeItem (String itemId){
        int index = SearchItemByID(itemId);

        if (index <0){
            System.out.println("Item not found ");
            return;
        }
        items.remove(index);
    }
    public void displayAllItem (){
        System.out.println("Total items " + items.size());
        for (LibraryItem item: items){
            item.displayInfo();
        }
    }
    public void displayItemByType (Itemt type){
        for (int i = 0 ; i < items.size(); i++){
            if (items.get(i).getType() == type){
                items.get(i).displayInfo();
            }
        }
    }
    public LibraryItem searchItembytext (String searchText){
        for (int i = 0 ; i<items.size();i++){
            LibraryItem item = items.get(i);
            String title = item.getTitle();
            String itemID = item.getId();
            if (title.contains(searchText) || itemID.equals(searchText)) {
                return item;
            }
        }
        return null;
    }
private int SearchItemByID(String itemId){
        for (int i =0 ; i<items.size();i++){
            if (items.get(i).getId().equals(itemId)){
                return i;
            }
        }
        return -1;
}

    }

