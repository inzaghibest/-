package com.factory;

public class YellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的!");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话一般是双字节!");
    }
}
