package com.Common;

/**
 * Created by zhangxp on 2020/7/14.
 */
public class ConcreteVisitor implements IVisitor {
    public void visit(ConcreteElement1 concreteElement1) {
        concreteElement1.doSomething();
        System.out.println("访问ConcreteElement1");
    }

    public void visit(ConcreteElement2 concreteElement2) {
        concreteElement2.doSomething();
        System.out.println("访问ConcreteElement2");
    }

}
