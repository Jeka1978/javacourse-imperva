package com.imperva.inheritance;

import lombok.AllArgsConstructor;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Son extends Parent {

    public Son() {
        super(12);
        System.out.println(122);
    }
}
