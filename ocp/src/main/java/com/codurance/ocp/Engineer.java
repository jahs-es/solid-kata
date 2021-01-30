package com.codurance.ocp;

public class Engineer implements IPayAmount {
    int salary;

    Engineer(int salary) {
        this.salary = salary;
    }

    @Override
    public int payAmount() {
        return salary;
    }
}
