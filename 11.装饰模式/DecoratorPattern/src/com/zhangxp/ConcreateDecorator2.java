package com.zhangxp;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class ConcreateDecorator2 extends Decorator {
    // 定义被修饰者
    public ConcreateDecorator2(Component component)
    {
        super(component);
    }

    // 定义自己的修饰方法
    public void method2()
    {
        System.out.println("xxxxxxxxxxxxxxxx修饰xxxxxxxxxxxxxxx");
    }

    public void doSomething()
    {
        this.method2();
        super.doSomething();
    }
}
