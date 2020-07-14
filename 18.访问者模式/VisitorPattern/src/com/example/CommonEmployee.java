package com.example;

/**
 * Created by zhangxp on 2020/7/14.
 */
// 普通员工
public class CommonEmployee extends Employee {
    private String job;
    public void setJob(String job)
    {
        this.job = job;
    }

    public String getJob()
    {
        return this.job;
    }

    @Override
    public void accept(IVisitor iVisitor)
    {
        iVisitor.visit(this);
    }
}
