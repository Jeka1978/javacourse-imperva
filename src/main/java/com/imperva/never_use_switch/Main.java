package com.imperva.never_use_switch;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InterruptedException {
        MailSender mailSender = new MailSender();
        while (true) {
            mailSender.sendMail();
            Thread.sleep(1000);
        }
    }
}
