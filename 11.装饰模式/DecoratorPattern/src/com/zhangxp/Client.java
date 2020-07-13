package com.zhangxp;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class Client {
    public static void main(String[] args)
    {
        Component component = new ConcreateComponent();

        component = new ConcreateDecorator(component);
        component = new ConcreateDecorator2(component);

        component.doSomething();
    }
}
