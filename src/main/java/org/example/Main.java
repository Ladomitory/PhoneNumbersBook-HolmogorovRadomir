package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PhoneNumbersBook phoneBook = new PhoneNumbersBook();
        phoneBook.add("Ivan", 123);
        phoneBook.add("Anna", 56784);
        phoneBook.add("Ivan", 4563);
        phoneBook.add("Anna", 132);
        phoneBook.add("Oleg", 345);
        phoneBook.add("Anna", 5432);
        phoneBook.printlnPhoneBook();
    }
}