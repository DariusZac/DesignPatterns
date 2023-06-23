package Adapter;

import Utils.Utils;

import static Utils.Utils.*;

public class Adapter {
    public static void main(String[] args) {
        ContactsService adapter = new ActorsServiceAdapter();
        ContactsService singers = new SingersApi();

        System.out.println("Names from actors adapter:");
        printFromArray(adapter.getAllNames());
        System.out.println("Last names from actors adapter:");
        printFromArray(adapter.getAllLastNames());
        System.out.println("Singers names:");
        printFromArray(singers.getAllNames());
        System.out.println("Singers last names:");
        printFromArray(singers.getAllLastNames());
    }
}
