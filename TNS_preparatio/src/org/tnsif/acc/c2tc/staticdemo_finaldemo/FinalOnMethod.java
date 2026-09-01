package org.tnsif.acc.c2tc.staticdemo_finaldemo;

class Bank {

    final void security_Rule() {
        System.out.println("Follow KYC and OTP verification");
    }
}

class SBI extends Bank {
    // Cannot override security_Rule()
}

public class FinalOnMethod {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        sbi.security_Rule();
    }
}