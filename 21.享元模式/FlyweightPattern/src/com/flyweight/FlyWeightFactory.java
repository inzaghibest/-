package com.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
    // 定义一个池容器
    private static HashMap<String, FlyWeight> pool = new HashMap<String, FlyWeight>();

    // 享元工厂
    public static FlyWeight getFlyWeight(String exterinisc)
    {
        // 需要返回的对象
        FlyWeight flyWeight = null;
        if (!pool.containsKey(exterinisc))
        {
            flyWeight = new ConcreteFlyWeight(exterinisc);
            pool.put(exterinisc, flyWeight);
            System.out.println("创建对象，放入池中...");
        }else
        {
            flyWeight = pool.get(exterinisc);
            System.out.println("直接取出对象从池中...");
        }
        return flyWeight;
    }

}
