package com.Common;

/**
 * Created by zhangxp on 2020/7/14.
 */
public class Client {
    public static void main(String[] args)
    {
        for (int i = 0; i<10; i++)
        {
            Element element = ObjectStruture.createElement();
            element.accept(new ConcreteVisitor());
        }
    }
}
