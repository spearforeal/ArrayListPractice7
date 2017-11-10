package com.joegomez;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Rolodex rolodex = new Rolodex("0039 330 4484");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter actions: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down....");
                    quit = true;
                    break;
                case 1:
                    rolodex.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4;
                    removeContact();
                    break; 


            }

        }
    }


    private static void startPhone(){
        System.out.println("Starting a phone....");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update existing contact\n"+
                           "4 - to remove an existing contact \n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - to print a lust of available actions.");
        System.out.println("Choose your actions: ");
    }
}
