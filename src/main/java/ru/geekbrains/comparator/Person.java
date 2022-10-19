package ru.geekbrains.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    private static int compare(Person o1, Person o2) {
        return Integer.compare(o1.height, o2.height);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.age > o.age) return 1;
            else if (this.age == o.age) return 0;
            else return -1;
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Олег", 20, 100, 190));
        peoples.add(new Person("Даша", 25, 55, 165));
        peoples.add(new Person("Даша", 18, 55, 165));
        peoples.add(new Person("Даша", 40, 55, 165));
        peoples.add(new Person("Маша", 28, 52, 168));
        peoples.add(new Person("Вася", 18, 90, 176));
        peoples.add(new Person("Вася", 35, 90, 176));
//        Collections.sort(peoples);
        peoples.sort(Person::compare);

        for (Person people : peoples) {
            System.out.println(people);
        }
    }
}
