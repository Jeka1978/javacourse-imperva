package com.imperva.builder;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {

        PolicyService policyService = PolicyService.builder().driveAge(24).vetek(6).licenseAge(7).build();
        System.out.println("policyService = " + policyService);

    }
}
