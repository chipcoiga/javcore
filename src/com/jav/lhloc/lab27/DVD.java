package com.jav.lhloc.lab27;

public class DVD extends LibraryItem {
    private int duration; //thời lượng bao nhiêu phút
    private String director; //đạo diễn

    public DVD(String title, String itemId, int duration, String director) {
        super(title, itemId);
        this.duration = duration;
        this.director = director;
    }

    @Override
    public void displayInfo() {
        String info = buildDVDInfo();
        System.out.println(info);
    }

    @Override
    public ItemType getType() {
        return ItemType.DVD;
    }

    private String buildDVDInfo() {
        return "DVD{" +
                "duration=" + duration +
                ", director='" + director + '\'' +
                ", title=" + super.getTitle() +
                ", itemId=" + super.getItemId() +
                ", Type=" + getType().name() +
                '}';
    }
}
