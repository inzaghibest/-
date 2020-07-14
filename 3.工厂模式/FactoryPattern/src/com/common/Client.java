package com.common;

public class Client {
    public static void main(String[] args)
    {
        Creator create = new ConcreteCreator();
        Product product = create.createProduct(ConcreteProduct1.class);
        product.method();
    }
}
