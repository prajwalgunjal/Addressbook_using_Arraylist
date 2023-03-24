package com.bridgelabz.AddressBookUsingArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressbookMain {
    static Scanner sc= new Scanner(System.in);

    ArrayList<AddressBook> addressbookstore = new ArrayList<>();
    public  void addAddressbook(){
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter name of the addressbook");
        String nm = sc.next();
        addressBook.setAddressBook(nm);
        addressbookstore.add(addressBook);
        System.out.println("Addressbook is added!!!");
        choice();
    }
    public void printallAddressbook(){
        for(int i=0;i<addressbookstore.size();i++) {
            System.out.println(addressbookstore);
        }
    }
    public void choice(){
        System.out.println("Welcome to AddressBook");
        boolean flag = true;
        while(flag) {
            System.out.println("Which operation do you want to perform");
            System.out.println("\n 0) Exit \n1) Add contact \n2) Display contact \n3) Edit \n4) Delete\n5) Add new addressbook \n6) Display all addressbook");
            int choice = sc.nextInt();
            switch (choice) {
                case 0 -> flag=false;
                case 1 -> addA();

                case 2 -> displayA();

                case 3 -> editA();

                case 4 -> deleteA();

                case 5 -> addAddressbook();

                case 6 -> printallAddressbook();
            }
        }

    }
    public void displayA(){
        System.out.println("Enter name of the addressbook in which you want to display contact");
        String name=sc.next();
        for (int i=0;i<addressbookstore.size();i++) {
            AddressBook temp = addressbookstore.get(i);
            if(temp.getAddressBook().equals(name))
            {
                temp.display();
            }
        }
    }

    public void editA(){
        System.out.println("Enter name of the addressbook in which you want to edit contact");
        String name= sc.next();
        for(int i=0;i<addressbookstore.size();i++)
        {
            AddressBook temp = addressbookstore.get(i);
            if(temp.getAddressBook().equals(name)){
                temp.edit();
            }
        }
    }
    public void deleteA(){
        System.out.println("Enter name of the addressbook in which you want to delete contact");
        String name = sc.next();
        for(int i=0;i<addressbookstore.size();i++){
            AddressBook temp = addressbookstore.get(i);
            if(temp.getAddressBook().equals(name)){
                temp.delete();
            }
        }
    }
    public  void addA(){
        System.out.println("Enter name of  the addressbook in which you want to add contact");
        String name=sc.next();
        for (int i=0;i<addressbookstore.size();i++){
            AddressBook temp = addressbookstore.get(i);
            if(temp.getAddressBook().equals(name))
            {
                temp.add_contact();
                System.out.println("Contatc added");
            }
            else {
                System.out.println("Contact not found!!!");
            }
        }
    }
    public static void main(String[] args) {
        AddressbookMain addressbookMain = new AddressbookMain();
        addressbookMain.addAddressbook();
    }
}
