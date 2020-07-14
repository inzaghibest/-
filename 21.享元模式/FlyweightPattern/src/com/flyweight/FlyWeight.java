package com.flyweight;

public abstract class FlyWeight {
    // 内部状态
    private String intrinisc;
    // 外部状态
    protected final String Extrinisc;

    public FlyWeight(String extrinisc)
    {
        this.Extrinisc = extrinisc;
    }

    // 定义业务操作
    public abstract void operation();

    public String getIntrinisc() {
        return intrinisc;
    }

    public void setIntrinisc(String intrinisc) {
        this.intrinisc = intrinisc;
    }
}
