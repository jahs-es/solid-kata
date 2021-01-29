package com.codurance.ocp;

public class Engineer extends Employee {
    Engineer(int salary, int bonus) {
        super(salary, bonus);
    }

    @Override
    int payAmount() {
        return salary;
    }
}
