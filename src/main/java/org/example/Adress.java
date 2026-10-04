package org.example;

public class Adress {
    private final String conuntry;
    private final String street;
    private final int number;
    private final String city;

    public Adress(Country country, String city, String street, int number) {
        this.conuntry = country.getName();
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getCountry() {
        return conuntry;
    }

}
