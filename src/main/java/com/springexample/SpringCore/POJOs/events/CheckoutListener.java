package com.springexample.SpringCore.POJOs.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.Date;

public class CheckoutListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof CheckoutEvent) {
            Date time = ((CheckoutEvent) applicationEvent).getTime();
            System.out.println("Checkout event [" + time + "]");
        }
    }
}
