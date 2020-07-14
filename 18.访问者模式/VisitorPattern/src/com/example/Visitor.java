package com.example;

/**
 * Created by zhangxp on 2020/7/14.
 */
public class Visitor implements IVisitor {
    // 普通员工的工资系数是1.2
    private static int COMMON_SYS = 2;
    // 经理的工资系数是5
    private static int MANAGER_SYS = 5;
    // 普通员工工资总和
    private int commonTotalSalary = 0;
    // 经理员工工资总和
    private int managerTotalSalary = 0;
    // 访问普通员工
    public void visit(CommonEmployee commonEmployee)
    {
        getCommonSalaryTotal(commonEmployee.getSalary());
        System.out.println(getCommonEmployee(commonEmployee));
    }
    // 访问总经理
    public void visit(Manager mananger)
    {
        getManagerSalaryTotal(mananger.getSalary());
        System.out.println(getManagerEmployee(mananger));
    }

    // 组装基本信息
    private String getBasicInfo(Employee employee)
    {
        String info = "姓名:" + employee.getName();
        info+="年龄: " + employee.getAge();
        info += "薪水: " + employee.getSalary();
        return info;
    }

    // 普通员工信息
    private String getCommonEmployee(CommonEmployee employee)
    {
        String commonInfo = getBasicInfo(employee);
        commonInfo += "工作内容: " + employee.getJob();
        return commonInfo;
    }

    // 经理员工信息
    private String getManagerEmployee(Manager manager)
    {
        String commonInfo = getBasicInfo(manager);
        commonInfo += "经理业绩: " + manager.getPerformance();
        return commonInfo;
    }

    // 计算普通员工的资金总和
    private void getCommonSalaryTotal(int salary)
    {
        this.commonTotalSalary += salary*COMMON_SYS;
    }

    // 计算经理员工的资金总和
    private void getManagerSalaryTotal(int salary)
    {
        this.managerTotalSalary += salary*MANAGER_SYS;
    }

    public int getTotalSalay()
    {
        return this.commonTotalSalary + this.managerTotalSalary;
    }
}

