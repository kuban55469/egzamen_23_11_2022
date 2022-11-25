package egzamen_1;

import egzamen_1.animal.Animal;
import egzamen_1.animal.AnimalType;
import egzamen_1.animal.Eagle;
import egzamen_1.animal.Horse;
import egzamen_1.person.Person;
import egzamen_1.transport.Bus;
import egzamen_1.transport.Helicopter;
import egzamen_1.transport.Transport;
import egzamen_1.transport.TransportType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal horse1 = new Horse("Axiles", 100, AnimalType.DOMESTIC_ANIMAL);
        Animal horse2 = new Horse("Karager", 120, AnimalType.DOMESTIC_ANIMAL);
        Animal horse3 = new Horse("Toruger", 150, AnimalType.DOMESTIC_ANIMAL);

        Animal eagle1 = new Eagle("Krachaar", 300, AnimalType.BIRD);
        Animal eagle2 = new Eagle("Anchy", 200, AnimalType.BIRD);
        Animal eagle3 = new Eagle("Akchaar", 250, AnimalType.BIRD);
        Animal[] animalsss = {horse1, horse2, horse3, eagle1, eagle2, eagle3};

        Transport bus1 = new Bus("Sprinter", 2002, TransportType.ROAD_TRANSPORT);
        Transport bus2 = new Bus("Ford", 2004, TransportType.ROAD_TRANSPORT);
        Transport bus3 = new Bus("Gazel", 2017, TransportType.ROAD_TRANSPORT);

        Transport helicopter1 = new Helicopter("MIG-2", 2018, TransportType.AIR_TRANSPORT);
        Transport helicopter2 = new Helicopter("AKA-4", 2019, TransportType.AIR_TRANSPORT);
        Transport helicopter3 = new Helicopter("DIDOS", 2022, TransportType.AIR_TRANSPORT);
        Transport[] transports = {bus1, bus2, bus3, helicopter1, helicopter2, helicopter3};

        Animal[] animalsAsan = {horse1, eagle1};
        Animal[] animalsUson = {horse2, horse3};
        Animal[] animalsAdyl = {eagle2, eagle3};

        Transport[] transportsAsan = {bus1, bus2, helicopter1};
        Transport[] transportsUson = {bus3, helicopter2};
        Transport[] transportsAdyl = {helicopter3};

        Person people1 = new Person("Asan", 29, animalsAsan, transportsAsan);
        Person people2 = new Person("Uson", 49, animalsUson, transportsUson);
        Person people = new Person("Adyl", 42, animalsAdyl, transportsAdyl);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        method1(animalsss, transports, scanner.nextLine());

        method2(animalsss);

        method3(transports);
    }

    public static void method1(Animal[] animals, Transport[] transports, String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.println(animal.toString());
            }
        }
        for (Transport transport : transports) {
            if (transport.getName().equals(name)) {
                System.out.println(transport.toString());
            }
        }
    }

    public static void method2(Animal[] animals) {
        Scanner scanner = new Scanner(System.in);
        for (Animal animal : animals) {
            if (animal.getAnimalType().equals(AnimalType.DOMESTIC_ANIMAL)) {
                animal.run();
                animal.eat(" Herb.");
            }
            System.out.println();
            if (animal.getAnimalType().equals(AnimalType.BIRD)) {
                animal.run();
                animal.eat(" meat.");
                animal.fly();
            }
        }
    }

    public static void method3(Transport[] transports) {
        for (Transport transport : transports) {
            if (transport.getTransportType().equals(TransportType.ROAD_TRANSPORT)){
                transport.fuelConsumption("Diesel ",80);
            }
            System.out.println();
            if (transport.getTransportType().equals(TransportType.AIR_TRANSPORT)){
                transport.fly();
                transport.fuelConsumption("Petrol ", 150);
            }
        }
    }

}
