package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final List<Hobby> hobbies = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void addHobby(Hobby hobby){
        this.hobbies.add(hobby);

    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
