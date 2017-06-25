package com.imperva.inheritance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 25/06/2017.
 */
@Data
@NoArgsConstructor
public class Parent {
    private int x;

    public Parent(int x) {
        this.x = x;
    }
}
