package never_use_switch;

import com.imperva.never_use_switch.EmailCallbackMailGenerator;
import com.imperva.never_use_switch.MailGenerator;
import com.imperva.never_use_switch.WelcomeMailGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 28/06/2017.
 */
@AllArgsConstructor
@Getter
public enum MailCodeEnum {
    WELCOME(1,new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator());

    private static Map<Integer, MailCodeEnum> map = new HashMap<>();
    static {
        MailCodeEnum[] enums = values();
        for (MailCodeEnum anEnum : enums) {
            map.put(anEnum.dbCode, anEnum);
        }
    }

    private int dbCode;
    private MailGenerator mailGenerator;


    public static MailCodeEnum findByDbCode(int dbCode) {
        MailCodeEnum mailCodeEnum = map.get(dbCode);
        if (mailCodeEnum == null) {
            throw new RuntimeException("dbcode " + dbCode + " not supported yet");
        }
        return mailCodeEnum;
    }


















}
