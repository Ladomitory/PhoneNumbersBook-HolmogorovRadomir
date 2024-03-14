package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumbersBook {
    private HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, int number) {
        if (phoneBook.containsKey(name) && phoneBook.get(name) != null) {
            ArrayList<Integer> tempPhoneArray = phoneBook.get(name);
            tempPhoneArray.add(number);
            phoneBook.put(name, tempPhoneArray);
        } else {
            ArrayList<Integer> newPhoneArray = new ArrayList<>();
            newPhoneArray.add(number);
            phoneBook.put(name, newPhoneArray);
        }
    }

    public ArrayList<Integer> getPhoneNumbers(String name) {
        return phoneBook.get(name);
    }

    public void printlnPhoneBook() {
        System.out.println(phoneBook);
    }

    public HashMap<String, ArrayList<Integer>> getPhoneBook() {
            return phoneBook;
    }

    public void setPhoneBook(HashMap<String, ArrayList<Integer>> phoneBook) {
        this.phoneBook = phoneBook;
    }
}
