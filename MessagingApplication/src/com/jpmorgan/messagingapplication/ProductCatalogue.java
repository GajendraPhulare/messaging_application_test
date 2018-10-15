/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpmorgan.messagingapplication;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gajendra.phulare
 */
public class ProductCatalogue {
     public static Set<Product> products=new LinkedHashSet<Product>();
     

    public ProductCatalogue() {
    }

    public static Set<Product> getProducts() {
        return products;
    }

    public static void setProducts(Set<Product> products) {
        ProductCatalogue.products = products;
      
    }
    
   public static void populateCatalogue(){
   
   products.add(new Product(1,"product_1",10,-0.5));
   products.add(new Product(2,"product_2",20,-0.6));
   products.add(new Product(3,"product_3",30,-0.7));
   products.add(new Product(4,"product_4",40,-0.8));
   products.add(new Product(5,"product_5",50,-0.9));
  
   
   }
     
    public static void printCatalogue(){
    
        System.out.println("****** Product Catalogue *******");
        if (products != null && products.size() > 0) {
            System.out.println("Id       Name         Price");
            for (Product p : products) {
                System.out.println(p.id + "     " + p.name + "       " + p.price);
            }
        } else {
            System.out.println("****** Product Catalogue is empty. *******");
        }
    }
     
}
