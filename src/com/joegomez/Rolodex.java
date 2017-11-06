package com.joegomez;

import java.util.ArrayList;

public class Rolodex {
    private String myNumber;
    private ArrayList<Contact>myContacts;

    public Rolodex(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }
}
