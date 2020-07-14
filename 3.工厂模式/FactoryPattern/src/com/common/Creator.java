package com.common;

// 工厂类的抽象定义
public abstract class Creator {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
