package com.codurance.ocp;

public class Manager extends Employee {
    Manager(int salary, int bonus) {
        super(salary, bonus);
    }

    @Override
    int payAmount() {
        return bonus + salary;
    }
}
