package com.company;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("10th Street", "Banglore", "Karnataka" + "", "Vikas", "1234567", "asdfg@gmail.com");
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
        System.out.println(passenger.toString());

        Flight flight = new Flight("1234","Upgrad airlines",120,20);
        RegularTicket regularTicket = new RegularTicket("Reg-123", "BOM", "BLR","12/12/12","12/12/21",false,flight,passenger,"Fooding");
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}








