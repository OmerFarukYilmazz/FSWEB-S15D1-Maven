package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>(myContacts);
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        }
        return false;
    }
    public boolean updateContact(Contact oldcontact , Contact newcontact){
        if(myContacts.contains(oldcontact)){
            int index = myContacts.indexOf(oldcontact);
            myContacts.set(index,newcontact);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;


        /* if we don't override equals method this(contains method) doesn't work because contains check is there same object in?
        Contact c1 = new Contact("John", "12345");
        Contact c2 = new Contact("John", "12345");
        same values but different reference.
         */
        /*
        for (Contact contactI: myContacts) {
            if (contactI.getName().equals(contact.getName()) && contactI.getPhoneNumber().equals(contact.getPhoneNumber())) {
                return this.myContacts.remove(contactI);
            }
        }
        System.out.println(myContacts);
        return false;
        */

    }

    public int findContact(Contact contact){
        if(this.myContacts.contains(contact)){
            return this.myContacts.indexOf(contact);
        }
        return -1;

        /*
        for (Contact contactI: myContacts) {
            if (contactI.getName().equals(contact.getName()) && contactI.getPhoneNumber().equals(contact.getPhoneNumber())) {
                return myContacts.indexOf(contactI);
            }
        }
        return -1;
         */
    }

    public int findContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }


    public void printContact(){
        for(Contact contact: myContacts){
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    public String getMyNumber() {
        return myNumber;
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }
}
