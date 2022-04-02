package com.logicalconstant;

public class Facade {
    static UserService userService;
    static ProductService productService;
    static PaymentService paymentService;
    static NotificationService notificationService;

    public static void placeOrder(String userId, String productId){
        System.out.println("[facade]starting order placement");
        boolean userValid = userService.isUserValid(userId);
        boolean productAvailable = ProductService.isProductAvailable(productId);

        if (userValid==true && productAvailable==true){
            productService.assignProductToUser(productId, userId);
            paymentService.makePayment(userId, productId);
            notificationService.notifyDealer(productId);
        }
    }
}
