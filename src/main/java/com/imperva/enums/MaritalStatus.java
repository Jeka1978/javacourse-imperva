package com.imperva.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Evegeny on 28/06/2017.
 */
@Getter
public enum MaritalStatus {
    SINGLE(1,"רווק"), MARRIED(2,"נשוי"), DIVORCED(3,"גרוש");

    private final int dbCode;
    private final String hebrewDesc;

    MaritalStatus(int dbCode, String hebrewDesc) {
        System.out.println("dbCode = " + dbCode);
        System.out.println("ENUM WAS CREARED");
        this.dbCode = dbCode;
        this.hebrewDesc = hebrewDesc;
    }

    public void printHebrewDesc() {
        System.out.println(hebrewDesc);
    }


    public static MaritalStatus findByDbCode(int dbCode) throws Exception {
        MaritalStatus[] statuses = values();
        for (MaritalStatus status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
        throw new Exception(dbCode + " not supported yet");
    }













}
