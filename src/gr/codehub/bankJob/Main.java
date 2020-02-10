package gr.codehub.bankJob;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        newAccounts();

    }

    public static void newAccounts(){

        Account a = new Account(1000.00, "Elric");
        a.addAccount(new Account(2000.00, "Sherlock"));
        a.addAccount(new Account(2000.00, "Gulliver"));
        //System.out.println(a.toString());

        }

}



