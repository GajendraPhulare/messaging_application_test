/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpmorgan.messagingapplication;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gajendra.phulare
 */
public class MessagingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ProductCatalogue.populateCatalogue();
        ProductCatalogue.printCatalogue();
        int count=0;
        
            try(Scanner sc=new Scanner(System.in)){
             
                do{
                    
                    if(count !=0 && count%1==0 && count%5!=0){
                    
                     System.out.println("***Product  details***");
                     ProductSell.printSellDetails();
                    } 
                    if(count!=0 && count%5==0){
                        System.out.println("****Pausing application....***");
                         System.out.println("****Product adjustment details***");
                         ProductSell.printSellAndAdjDetails();
                  
                    }
                    
                    System.out.print("Enter product id:");
               boolean isValidId= sc.hasNextInt();
               
               
               if(isValidId){
                   int id=sc.nextInt();
                   
                   do{
               System.out.print("Enter product qty:");
               boolean isValidQty= sc.hasNextInt();
               if(isValidQty){
                   int q=sc.nextInt();
                   
                   if(ProductSell.totalSellInfo.containsKey(id)){
                       int qnty=ProductSell.totalSellInfo.get(id);
                        ProductSell.totalSellInfo.put(id, q+qnty);
                   }else{
                        ProductSell.totalSellInfo.put(id, q);
                   }
                 
                   count++;
                   break;
               }else{
                   sc.nextLine();
                   System.out.print("Invalid qty.");
                   sc.nextLine();
                              }
                }while(true);
                   
               }else{
                   sc.nextLine();
                   System.out.print("Invalid id.");
                   sc.nextLine();
               
               }
                    
               
                }while(true);
          }
    
}
    
}
