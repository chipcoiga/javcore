package com.jav.hoang.BaiTap3;
import java.util.ArrayList;

public class ProductManagement {
        ArrayList <Product> prd = new ArrayList<>();

    public void addNewItem (Product product){
        prd.add(product);

    }
    public void displayAll(){
        for (Product pro : prd){
            System.out.println(pro.displayInfo());
        }

    }
    public void getItemByType (ProductCategory type){
        for (int i = 0 ; i< prd.size();i++){
            Product product = prd.get(i);
            if (prd.get(i).getProductCategory() == type){
                System.out.println(product.displayInfo());
            }
        }
    }
}
