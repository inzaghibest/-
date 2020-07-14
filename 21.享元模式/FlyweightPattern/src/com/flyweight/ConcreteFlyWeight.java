package com.flyweight;

public class ConcreteFlyWeight extends FlyWeight {
    public ConcreteFlyWeight(String extrinisc)
    {
        super(extrinisc);
    }
    @Override
    public void operation() {
        System.out.println("ConcreteFlyWeight..." + this.Extrinisc);
    }
}
