package com.springexample.SpringCore.POJOs.events;

import com.springexample.SpringCore.POJOs.shop.ShoppingCart;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.Date;

public class Cashier implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("setApplicationEventPublisher");
    }

    public void checkout(ShoppingCart cart) {
        CheckoutEvent event = new CheckoutEvent(this, new Date());
        applicationEventPublisher.publishEvent(event);
    }
}
