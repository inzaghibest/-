package com.example;

/**
 * Created by zhangxp on 2020/7/14.
 */
public class Manager extends Employee {
    private String performance;

    public void setPerformance(String performance)
    {
        this.performance = performance;
    }

    public String getPerformance()
    {
        return this.performance;
    }

    @Override
    public void accept(IVisitor visitor)
    {
        visitor.visit(this);
    }
}
