package com.flyweight;

public class ConcreteFlyWeight2 extends FlyWeight {
    public ConcreteFlyWeight2(String extrinisc)
    {
        super(extrinisc);
    }

    @Override
    public void operation() {
        System.out.println("ConcreteFlyWeight2..." + this.Extrinisc);
    }
}
