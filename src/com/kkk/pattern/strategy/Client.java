package com.kkk.pattern.strategy;

/**
 * Created by z3jjlzt on 2018/2/28.
 */
public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setStrategy(new Subway());
        employee.explain();
        employee.setStrategy(new Walk());
        employee.explain();

    }
}
