package org.example;

import java.util.List;

public class Hobby {
    private final String name;
    private final int frequency;
    List<Adress> addresses;

    public Hobby(String name, int frequency, List<Adress> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Adress> getAddresses() {
        return addresses;
    }
}
