/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpmorgan.messagingapplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author gajendra.phulare
 */
public class ProductSell {
    
    public static Map<Integer,Integer> totalSellInfo=new HashMap<Integer,Integer>();

    public ProductSell() {
    }

    public static Map<Integer, Integer> getTotalSellInfo() {
        return totalSellInfo;
    }

    public static void setTotalSellInfo(Map<Integer, Integer> totalSellInfo) {
        ProductSell.totalSellInfo = totalSellInfo;
    }
    
    public static void printSellDetails(){
        if(ProductCatalogue.products!=null && ProductCatalogue.products.size()!=0){
        if(totalSellInfo!=null && totalSellInfo.size()!=0){
        for(Entry entry:totalSellInfo.entrySet()){
        
            for(Product p:ProductCatalogue.products){
            if(p.id==(int)entry.getKey()){
                System.out.println((int)entry.getValue()+"  "+p.name+" at "+((p.price))+" GBP each");
            }
            
            }
            
            
        }
        }else{
        System.out.println("****Product info not available.");
        }
        }else{
        System.out.println("****Product info not available.");
        }
    }
    
    public static void printSellAndAdjDetails(){
     if(ProductCatalogue.products!=null && ProductCatalogue.products.size()!=0){
        if(totalSellInfo!=null && totalSellInfo.size()!=0){
        for(Entry entry:totalSellInfo.entrySet()){
        
            for(Product p:ProductCatalogue.products){
            if(p.id==(int)entry.getKey()){
                System.out.println((int)entry.getValue()+"  "+p.name+" at "+((p.price))+" GBP with adjustment of "+p.adjustment +" GBP each");
            }
            
            }
            
            
        }
        }else{
        System.out.println("****Product info not available.");
        }
        }else{
        System.out.println("****Product info not available.");
        }
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
    
}
