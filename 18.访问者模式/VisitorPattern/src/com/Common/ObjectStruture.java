package com.Common;

import java.util.Random;

/**
 * Created by zhangxp on 2020/7/14.
 */
public class ObjectStruture {
    // 对象生成器
    public static Element createElement()
    {
        Random rand = new Random();
        if (rand.nextInt(100) > 50)
        {
            return new ConcreteElement1();
        }
        return new ConcreteElement2();
    }
}
