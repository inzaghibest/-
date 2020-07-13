package com.zhangxp;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class ConcreateDecorator extends Decorator {
    // 定义被修饰者
    public ConcreateDecorator(Component component)
    {
        super(component);
    }

    // 定义自己的修饰方法
    public void method1()
    {
        System.out.println("------------修饰--------------");
    }

    public void doSomething()
    {
        this.method1();
        super.doSomething();
    }

}
