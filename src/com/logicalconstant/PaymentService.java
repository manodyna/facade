package com.logicalconstant;

public class PaymentService implements Services{
    public static void makePayment(String userId, String productId){
        System.out.println("[PaymentService]charging user "+userId+" for product "+productId);
//        complex logic for making payment
    }
}
