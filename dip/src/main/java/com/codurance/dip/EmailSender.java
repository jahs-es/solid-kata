package com.codurance.dip;

public class EmailSender implements Sender {
    public void send(Employee employee) {
        Email emailToSend = emailFor(employee);

        System.out.print("To:"+emailToSend.getTo()+", Subject: "+emailToSend.getSubject()+", Message: "+emailToSend.getMessage());
    }

    private Email emailFor(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }
}
