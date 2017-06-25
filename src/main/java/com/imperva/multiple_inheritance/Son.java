package com.imperva.multiple_inheritance;

import java.util.ArrayList;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Son implements Mother, Father {

    public void xxx(int x, String... strings) {

    }

    @Override
    public void talkToSon(String str) {
        xxx(12,"sddas","asdas","asdassada");
    }

    @Override
    public void call(String string) {

    }
}
