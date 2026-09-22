package com.ompatel;

import dal.UserDatabase;
import entities.ProductFactory;
import entities.Order;
import entities.Product;
import entities.UserAccount;
import java.util.List;
public class ShopWorldApp {
    public static void main(String[] args) {
        /*
         * create user database using singleton pattern
         */
        UserDatabase userDatabase = UserDatabase.getInstance();

       ProductFactory productFactory = new ProductFactory();
       Product ElectronicProd = productFactory.CreateProduct("Electronic");
       ElectronicProd.displayInfo();

       Product ClothingProd = productFactory.CreateProduct("Clothing");
       ClothingProd.displayInfo();

       /*
        * Build the userAccount
       */
        UserAccount.UserAccountBuilder userBuilder = new UserAccount.UserAccountBuilder("ompatel", "123");
        UserAccount userAccount = userBuilder.build();
        System.out.println(userAccount);

        /*
            Build the order
        */
       Order.OrderBuilder orderBuilder = new Order.OrderBuilder("order123", List.of(ElectronicProd, ClothingProd));
       Order order = orderBuilder.build();
       System.out.println(order);
    }
}
