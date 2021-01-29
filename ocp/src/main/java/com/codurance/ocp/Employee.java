package com.codurance.ocp;

public abstract class Employee {
    protected int salary;
    protected int bonus;

    Employee(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    abstract int payAmount();
}