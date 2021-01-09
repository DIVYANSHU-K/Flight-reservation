
package com.upgrad;

public class Address {
    public String street;
    public String city;
    public String state;


    public Address() { //providing default constructor

    }
    public Address(String street,String city, String state) { //parameterized constructor for Address class
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String getAddressDetails(){
        return street +","+city+ "," + state;
    }

    public void updateAddressDetails(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

} 
