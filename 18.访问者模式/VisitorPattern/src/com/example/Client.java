package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangxp on 2020/7/14.
 */
public class Client {
    public static void main(String[] args)
    {
        IVisitor visitor = new Visitor();
        for (Employee e:mockEmployee())
        {
            e.accept(visitor);
        }

        System.out.println("工资总额为: " + visitor.getTotalSalay());
    }

    // 模拟产生多个员工信息
    public static List<Employee> mockEmployee()
    {
        List<Employee> empList = new ArrayList<Employee>();
        // 张晓平这名普通苦逼员工
        CommonEmployee employee = new CommonEmployee();
        employee.setName("张晓平");
        employee.setAge(28);
        employee.setSalary(35000);
        employee.setJob("苦逼的码代码和一些杂七杂八的事情...");
        empList.add(employee);
        // UI设计师
        CommonEmployee employee1 = new CommonEmployee();
        employee1.setName("红红");
        employee1.setAge(24);
        employee1.setSalary(24000);
        employee1.setJob("设计一些基本元素，流行审美的人...");
        empList.add(employee1);

        // 总经理
        Manager manager = new Manager();
        manager.setName("王建勋");
        manager.setAge(45);
        manager.setSalary(40000);
        manager.setPerformance("带领员工加班365天，完成项目18个!");
        empList.add(manager);

        return empList;
    }
}
