package myapp;

import java.util.LinkedList;
import java.util.UUID;


public class Account {
    private String name = " ";
    private String acctID = UUID.randomUUID().toString().substring(0, 8);
    private float balance = 0;
    private List<String> transaction = new LinkedList<>();

    public BankAccount(String name) {
        this.name = name;

    }

    public BankAccount(String name, float initialBalance) {
        
    }
}
