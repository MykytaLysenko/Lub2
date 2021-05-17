package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.printf("%s%n",Account.capitalize("stanisŁaw maruSARz"));
        System.out.printf("%s%n",Account.translit("stanisŁARzaw maruS"));
        System.out.println(acc.getName());
        System.out.printf("%s%n", Account.translit("Оксана"));
        System.out.printf("%s%n", Account.translit("Миколай"));
        System.out.printf("%s%n", Account.translit("Евгений"));
        }

    }
