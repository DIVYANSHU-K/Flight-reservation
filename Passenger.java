package com.company;

public class Passenger {

    private static int idCounter = 0;
    private  int id;

    private static class Address {
        String street;
        String city;
        String state;


        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
    }

    private static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    private Contact contact;
    private Address address;

    public Passenger(String street, String city, String state, String name, String phone , String email){
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone , email);
    }

    public int getId(){
        return this.id;
    }

    public String getAddressDetails() {
        return "Street :"+ address.street + "city :" + address.city + " State : " + address.state;
    }

    public String getContactDetails() {
        return "Name :"+ contact.name + "Number :" + contact.phone + " email : " + contact.email;
    }

    public static  int getPassengerCount() {
        return idCounter;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", contact=" + contact +
                ", address=" + address +
                '}';
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

