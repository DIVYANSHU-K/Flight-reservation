package com.upgrad;

public class Contact {
    public String name;
    public String phoneNo;
    public String email;

    public Contact() {

    }

    public Contact(String name, String phoneNo, String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getContactDetails(){
        return name + "," + phoneNo +  "," + email;
    }
    public void updateContactDetails(String name, String phoneNo, String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}
