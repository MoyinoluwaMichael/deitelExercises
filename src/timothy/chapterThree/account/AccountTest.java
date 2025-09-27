package timothy.chapterThree.account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account timothyAccount = new Account();
        timothyAccount.setName("Timothy");
        timothyAccount.setAccountNumber("987654321");

        Account moyinAccount = new Account("Moyin", "123456789", 0.0, "1234");

        System.out.println("*** Timothy Account name ***::>> "+timothyAccount.getName());
        System.out.println("*** Moyin Account name ***::>> "+moyinAccount.getName());

    }
}
