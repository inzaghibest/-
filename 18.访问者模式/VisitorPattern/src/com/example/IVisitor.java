package com.example;

/**
 * Created by zhangxp on 2020/7/14.
 */
// 定义访问者的接口
public interface IVisitor {
    // 访问普通员工
    public void visit(CommonEmployee commonEmployee);
    // 访问总经理
    public void visit(Manager mananger);

    // 具有统计功能的访问者,获取工资总和
    public int getTotalSalay();
}
