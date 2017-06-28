package com.imperva.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Evegeny on 28/06/2017.
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private MaritalStatus maritalStatus;
}
