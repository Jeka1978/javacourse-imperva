package com.imperva.never_use_switch;

import java.util.Random;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class DBUtils {
    public static Random random = new Random();

    public static int getMailCode() {
        return random.nextInt(3) + 1;
    }
}
