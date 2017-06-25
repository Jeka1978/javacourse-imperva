package com.imperva.builder;

import lombok.Data;

/**
 * Created by Evegeny on 25/06/2017.
 */
@Data
public class PolicyService {
    private int driveAge;
    private int licenseAge;
    private int vetek;

    private PolicyService(int driveAge, int licenseAge, int vetek) {
        this.driveAge = driveAge;
        this.licenseAge = licenseAge;
        this.vetek = vetek;
    }

    public double policaHova() {
        return 0;
    }

    public static Buider builder() {
        return new Buider();
    }


    public static class Buider{
        private int driveAge;
        private int licenseAge;
        private int vetek;

        public Buider driveAge(int driveAge) {
            this.driveAge = driveAge;
            return this;
        }

        public Buider licenseAge(int licenseAge) {
            this.licenseAge = licenseAge;
            return this;
        }

        public Buider vetek(int vetek) {
            this.vetek = vetek;
            return this;
        }


        public PolicyService build(){
            PolicyService policyService = new PolicyService(driveAge, licenseAge, vetek);

            validate(policyService);
            return policyService;
        }

        private void validate(PolicyService policyService) {
            if (policyService.getDriveAge() == 0) {
                throw new RuntimeException("age can't be 0");
            }
        }
    }

}















