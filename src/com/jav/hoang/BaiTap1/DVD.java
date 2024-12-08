package com.jav.hoang.BaiTap1;

public class DVD extends LibraryItem{
        int duration;
        String director;

        public DVD (String title,String id,int duration,String director){
            super(title,id);
            this.duration = duration;
            this.director = director;
        }

    @Override
    public void displayInfo() {
        String dvd =
                "duration {" +duration +
                        "director" + director +
                        "title " + super.getTitle()+
                        "id " + super.getId()+
                        "type" + getType().name()+
                        "}";
        System.out.println(dvd);
    }

    @Override
    public Itemt getType() {
        return Itemt.DVD;
    }
    public int getDuration (){
            return duration;
    }
    public String getDirector(){
            return director;
    }
}
