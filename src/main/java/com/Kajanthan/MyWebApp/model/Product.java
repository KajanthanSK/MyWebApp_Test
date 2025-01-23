package com.Kajanthan.MyWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Product
{
    private int prodId;
    private String prodName;
    private double price;

    public Product()
    {

    }

    public Product(int prodId, String prodName, double price)
    {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
}
