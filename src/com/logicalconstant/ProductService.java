package com.logicalconstant;

public class ProductService{
    static void assignProductToUser(String productId, String userId){
//        complex code for product assignment
        System.out.println("[ProductService]assigning "+productId
                           +" to user "+userId);
    }
    static boolean isProductAvailable(String productId){
//        complex code for checking product availability
        System.out.println("[ProductService]checking availability of "
                           +productId);
        return true;
    }
}
