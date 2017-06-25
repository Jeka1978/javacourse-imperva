package com.imperva.never_use_switch;

import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class MailSender {

    private Map<Integer, MailGenerator> map = new HashMap<>();

    public MailSender() throws IllegalAccessException, InstantiationException {
        Reflections scanner = new Reflections("com.imperva.never_use_switch");
        Set<Class<? extends MailGenerator>> classes = scanner.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> generatorClass : classes) {
            MailGenerator mailGenerator = generatorClass.newInstance();
            int mailCode = mailGenerator.mailCode();
            if (map.containsKey(mailCode)) {
                throw new IllegalStateException("mail code " + mailCode + " already in use");
            }
            map.put(mailCode, mailGenerator);
        }
    }

    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new IllegalStateException("mailcode " + mailCode + " not supported yet");
        }
        String html = mailGenerator.generateHtml();
        send(html);
    }

    private void send(String html) {
        System.out.println("sending... " + html);
    }
}





