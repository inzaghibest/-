package com.Common;

/**
 * Created by zhangxp on 2020/7/14.
 */
// 访问者定义
public interface IVisitor {
    // 定义访问哪些对象
    public void visit(ConcreteElement1 element1);
    public void visit(ConcreteElement2 element2);


}
