package com.company.exericies.ex05;

import com.company.exericies.ex04.Person;

public class Main {
    public static void main(String[] args) {
//        Person[] persons = new Person[4];
//        persons[0] = new Person("森田", "奈良");
        Person[] persons = {
                new Person("森田", "奈良"),
                new Person("木村", "埼玉")
        };
//        persons[0].getSelfIntroduction();
        for (int i = 0; i < persons.length; i++) {
            persons[i].getSelfIntroduction();
        }
        // 拡張for文
        for (Person person : persons) {
            person.getSelfIntroduction();
        }
    }
}
