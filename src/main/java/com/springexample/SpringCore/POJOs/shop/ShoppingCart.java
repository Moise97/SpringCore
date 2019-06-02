package com.springexample.SpringCore.POJOs.shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> items = new ArrayList<>();

    public List<Product> getItems() {
        return items;
    }

    public void setItems(Product item) {
        items.add(item);
    }
}
