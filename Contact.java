package com.bridgelabz.AddressBookUsingArrayList;

public class Contact {
    private String first_name;
    private String last_name;
    private String address;

    public Contact() {
    }

    public Contact(String first_name, String last_name, String address) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{ \n" +
                "first_name='" + first_name + '\'' +
                "\n last_name='" + last_name + '\'' +
                "\n address='" + address + '\'' +
                "\n"+'}';
    }
}
