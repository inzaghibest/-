package com.example;

/**
 * Created by zhangxp on 2020/7/14.
 */
// 员工类
public abstract class Employee {
    private int age;
    private String name;
    private int salary;

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getSalary()
    {
        return this.salary;
    }

    // 我允许一个访问者的访问
    public abstract void accept(IVisitor iVisitor);
}
