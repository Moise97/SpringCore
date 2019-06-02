package com.springexample.SpringCore.POJOs.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext shopContext = new GenericXmlApplicationContext("products.xml");

        Product battery = (Product) shopContext.getBean("battery");
        Product cd = (Product) shopContext.getBean("disk");
        Product dvd = (Product) shopContext.getBean("dvd");

        ShoppingCart cart1 = (ShoppingCart) shopContext.getBean("shoppingCart");
        cart1.setItems(battery);
        cart1.setItems(cd);
        cart1.setItems(dvd);
        System.out.println("Shopping cart 1 contains " + cart1.getItems());

        ShoppingCart cart2 = (ShoppingCart) shopContext.getBean("shoppingCart");
        cart2.setItems(dvd);
        System.out.println("Shopping cart 2 contains " + cart2.getItems());

    }

}
