package com.codurance.dip;

import java.time.MonthDay;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final Sender sender;
    private final Clock clock;

    public BirthdayGreeter(EmployeeRepository employeeRepository, Sender sender, Clock clock) {
        this.employeeRepository = employeeRepository;
        this.sender = sender;
        this.clock = clock;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        employeeRepository.findEmployeesBornOn(today)
                .stream()
                .forEach(employee -> sender.send(employee));
    }


}
