package com.zhangxp;

import java.util.Observable;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class Subject1 extends Observable {
    public void haveBreakfast() {
        System.out.println("我要吃饭了!");
        super.setChanged();
        super.notifyObservers();
    }

    public void haveFun()
    {
        System.out.println("我要娱乐了!");
        super.setChanged();
        super.notifyObservers();
    }
}
