package egzamen_1.person;

import egzamen_1.animal.Animal;
import egzamen_1.transport.Transport;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private Animal[] animals;
    private Transport[] transports;

    public Person(String name, int age, Animal[] animals, Transport[] transports) {
        this.name = name;
        this.age = age;
        this.animals = animals;
        this.transports = transports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public Transport[] getTransports() {
        return transports;
    }

    public void setTransports(Transport[] transports) {
        this.transports = transports;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animals=" + Arrays.toString(animals) +
                ", transports=" + Arrays.toString(transports) +
                '}';
    }
}
