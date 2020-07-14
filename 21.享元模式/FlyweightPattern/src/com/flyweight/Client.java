package com.flyweight;

public class Client {
    public static void main(String[] args)
    {
        for (int i = 0; i<100; i++) {
            ConcreteFlyWeight flyWeight = (ConcreteFlyWeight) FlyWeightFactory.getFlyWeight("张晓平");
            flyWeight.setIntrinisc("河北人");
            flyWeight.operation();
        }
    }
}
