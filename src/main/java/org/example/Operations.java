package org.example;

import java.util.*;

public class Operations {


    public static Set<Person> addPerson() {
        Set<Person> set = new TreeSet<>(new NameComp());

        Person p1 = new Hired("Dan", 32);
        Person p2 = new Student("Ana", 20);
        Person p3 = new Unemployed("John", 45);

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println("The person:");
        for (Person p : set) {
            System.out.println(p.getName() + " " + p.getAge());
        }
        return set;
    }

    public static Map<Person, List<Hobby>> addHobby(Set<Person> allPersons) {
        Map<Person, List<Hobby>> map = new HashMap<>();

        Country ro = new Country("Romania");
        Country it = new Country("Italia");
        Country es = new Country("Espagna");

        Adress address1 = new Adress(ro, "Zalau", "Mihai Vitreazul", 39);
        Adress address2 = new Adress(it, "Verona", "Fontana Vechia", 10);
        Adress address3 = new Adress(es, "Madrid", "El Generale", 32);

        List<Adress> addressSwimming = new ArrayList<>();
        addressSwimming.add(address1);

        List<Adress> addressCycling = new ArrayList<>();
        addressCycling.add(address2);

        List<Adress> addressClimbing = new ArrayList<>();
        addressClimbing.add(address3);


        Hobby swimming = new Hobby("Swimming", 2, addressSwimming);
        Hobby climbing = new Hobby("Climbing", 3, addressClimbing);
        Hobby cycling = new Hobby("Cycling", 5, addressCycling);

        for (Person p : allPersons) {

            if (p.getName().equals("Ana")) {
              p.addHobby(swimming);
                p.addHobby(cycling);
            } else if (p.getName().equals("Dan")) {
                p.addHobby(cycling);
            } else if (p.getName().equals("John")) {
                p.addHobby(swimming);
            }
            map.put(p, p.getHobbies());
        }

        return map;


    }


    public static void viewHobby(Person person, Map<Person, List<Hobby>> map) {

        List<Hobby> viewHobby = map.get(person);
        if (viewHobby != null) {
            System.out.println("The hobbies for: " + person.getName());
            for (Hobby h : viewHobby) {
                System.out.println(h.getName() + " - Can be practiced in:  ");

                Set<String> country = new HashSet<>();

                for (Adress adr : h.getAddresses()) {
                    country.add(adr.getCountry());

                }
                System.out.println(String.join(", ", country));
                System.out.println(person.getName() + " is "+ person.getClass().getSimpleName());
            }
        } else {
            System.out.println("Didn't found!");
        }
    }

}



