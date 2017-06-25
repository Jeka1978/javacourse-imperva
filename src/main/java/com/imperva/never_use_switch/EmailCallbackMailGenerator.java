package com.imperva.never_use_switch;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "<html>don't call us</html>";
    }

    @Override
    public int mailCode() {
        return 2;
    }
}
