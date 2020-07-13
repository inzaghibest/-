package com.zhangxp;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangxp on 2020/7/13.
 */
public class LiSi implements Observer {
    public void update(Observable observer, Object obj)
    {
        System.out.println("我看到你了!");
    }
}
