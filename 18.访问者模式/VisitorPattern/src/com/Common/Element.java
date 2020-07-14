package com.Common;

/**
 * Created by zhangxp on 2020/7/14.
 */
// 1.Element抽象的被访问者元素
public abstract class Element {
    // 具体的业务逻辑
    public abstract void doSomething();

    // 允许谁来访问
    public abstract void accept(IVisitor visitor);

}
