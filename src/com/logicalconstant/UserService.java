package com.logicalconstant;

public class UserService implements Services{
    @Override
    public static boolean isUserValid(String userId){
        System.out.println("[UserService]validating user ID, "+userId);
//        complex code for checking product availability
        return true;
    }
}
