package never_use_switch;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class MailSender {
    public void sendMail(){
        int dbCode = 2; /// was taken from db
        String html = MailCodeEnum.findByDbCode(dbCode).getMailGenerator().generateHtml();
        System.out.println("html = " + html);
    }
}
