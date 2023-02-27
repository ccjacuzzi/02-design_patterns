package com.ualr.patterns_example.model;

// This is just a data structure to mimic a DB
// Using a Map

import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<String, Contact> contacts;

    public Database() {
        contacts = new HashMap<>();
    }

    public void addContact(String id, String name){
        contacts.put(id, new Contact(name));
    }

    public String getContact(String id){
        String name = "";

        // Try/Catch Block
        try{
            name = contacts.get(id).getName();
        } catch (Exception e) {}

        return name;
    }
}
