package com.Kajanthan.MyWebApp.service;

import com.Kajanthan.MyWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{
    List<Product> products= Arrays.asList
            (
                    new Product(101,"Laptop",1000),
                    new Product(102,"Camera",2000),
                    new Product(103,"Phone",3000)
            );

    public List<Product> getProductList()
    {
        return products;
    }
}
