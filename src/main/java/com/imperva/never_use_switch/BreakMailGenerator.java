package com.imperva.never_use_switch;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class BreakMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "break for 15 minutes!";
    }

    @Override
    public int mailCode() {
        return 3;
    }
}
