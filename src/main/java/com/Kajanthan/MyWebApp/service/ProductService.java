package com.Kajanthan.MyWebApp.service;

import com.Kajanthan.MyWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{
    List<Product> products= new ArrayList<>(Arrays.asList(
            new Product(101, "Laptop", 1000),
            new Product(102, "Camera", 2000),
            new Product(103, "Phone", 3000)
    ));

    public List<Product> getProductList()
    {
        return products;
    }

    public Product getProductById(int id)
    {
        for(Product product:products)
        {
            if(product.getProdId()==id)
            {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product proud)
    {
        products.add(proud);
    }
}
