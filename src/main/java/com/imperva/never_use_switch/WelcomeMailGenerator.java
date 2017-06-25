package com.imperva.never_use_switch;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "<html>Welcome new Client</html>";
    }

    @Override
    public int mailCode() {
        return 1;
    }
}
