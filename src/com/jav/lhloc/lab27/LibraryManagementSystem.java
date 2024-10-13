package com.jav.lhloc.lab27;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(String itemId) {
        int index = searchItemById(itemId);

        if (index < 0) {
            System.out.println("Item not found");
            return;
        }

        items.remove(index);
    }

    public void displayAllItems() {
        System.out.println("Total items: " + items.size());
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

    public void displayItemsByType(ItemType type) {
        for (int i = 0 ; i < items.size(); i++) {
            if (items.get(i).getType() == type) {
                items.get(i).displayInfo();
            }
        }
    }

    public LibraryItem searchItemBySearchText(String searchText) {

        for (int i = 0 ; i < items.size(); i++) {

            LibraryItem item = items.get(i);
            String title = item.getTitle();
            String itemId = item.getItemId();

            if (title.contains(searchText) || itemId.equals(searchText)) {
                return item;
            }
        }

        return null;
    }

    private int searchItemById(String itemId) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemId().equals(itemId)) {
                return i;
            }
        }

        return -1;
    }
}
