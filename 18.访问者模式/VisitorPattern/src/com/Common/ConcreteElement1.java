package com.Common;

/**
 * Created by zhangxp on 2020/7/14.
 */
public class ConcreteElement1 extends Element {
    @Override
    public void doSomething()
    {
        System.out.println("I'm ConcreteElement1");
    }

    @Override
    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
