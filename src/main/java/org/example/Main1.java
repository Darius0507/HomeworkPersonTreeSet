package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main1 {
    static void main(String[] args) {
        Set<Person> treeAdd = Operations.addPerson();




        Map<Person, List<Hobby>> hobbies = Operations.addHobby(treeAdd);

        for (Person p : treeAdd) {
            Operations.viewHobby(p, hobbies);

        }

    }
}
