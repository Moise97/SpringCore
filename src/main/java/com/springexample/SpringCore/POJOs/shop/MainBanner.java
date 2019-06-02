package com.springexample.SpringCore.POJOs.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

public class MainBanner {

    public static void main(String[] args) {

        ApplicationContext bannerContext = new GenericXmlApplicationContext("products.xml");
        BannerLoader banner = (BannerLoader) bannerContext.getBean("banner");
        try {
            banner.showBanner();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
