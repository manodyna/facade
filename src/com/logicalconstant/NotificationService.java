package com.logicalconstant;

public class NotificationService implements Services{
    public static void notifyDealer(String productId){
        System.out.println("[NotificationService] notifying"+
                           "dealer about the sale of the product "+productId);
//        complex notification logic
    }
}
