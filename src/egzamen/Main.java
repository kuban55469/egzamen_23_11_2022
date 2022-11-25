package egzamen;

import address.Address;
import address.City;
import address.Country;
import egzamen.apartment.Apartment;
import egzamen.apartment.Home;
import egzamen.apartment.House;
import egzamen.person.Person;

public class Main {
    public static void main(String[] args) {
        /*
        Person деген класс тузунуз.
        Полялары: Id, firstName, lastName, age,
        email, phonNumber.
        1. Адамдын жашына терс санды жана 127
        ден чон санды берсениз. Консолдон “
        Жаш туура эмес берилип жатат !“ деп
        чыксын.
        2. Email ичинде  «@» созсуз камтылышы
        керек. Эерде жок болсо . Консолдон
        “Email туура эмес, «@» жок !” деп
        чыксын.
        3. Телефон номер +996 менен
        башталышы жана номердин цифралары
        толлук болуусу шарт.
        Номер туура эмес берилсе. Консолдон
        “Кыргыз мобильный номер телефонду
        гана алабыз деп чыксын!”
        Бир методду болсун: placeOfWork() .Бул
        метод ким кайсыл жумушта иштеерин,
        маалымат катары чыгарсын.
        Address деген класс тузунуз .
        Полялары : Id, country, city, address.
        Home деген абстракт класс тузунуз.
        Полялары: Id, title, address, price, maxGuest,
        people.
        1.  Price, maxGuest терс жана 0
        болбосун.
        Абстракт метод: service() . Бул метод
        “Коммунальная услуга, кварплатанын
        ичинде же андан сырткары толоосу керек”
        деген сыяктуу маалыматтарды кайтарсын.
        Home классын мурастаган эки класс
        болсун :
        House , Apartment. Бул класстарга ар
        бирине озунчо уникалдуу метод кошунуз.
        Main класстагы методдор:
        1.getPeople();             15 object
        кайтарсын
        2.getAddresses();         5 object
        кайтарсын
        3.sortHomeByPrice();
        4.getHouseByCity();
        5.getAppartmentByCity();
        6.getePopleInTheHouse();
        main методдо 3 House, 2 Apartment- тин
        объекттерин тузуп аларга аддресстерин
        жана адамдарын берип.
        Баардык меттоддорунузду иштетин!
        */

        Person[] people = {
                new Person(11, "Kuban", "Kelsinbekov", 20, "kuban@gmail.com", "+996708281399"),
                new Person(22, "Asan", "Mederov", 43, "asan@gmail.com", "+996708253746"),
                new Person(33, "Yson", "Saparov", 19, "yson@gmail.com", "+996704421398"),
                new Person(44, "Dastan", "Kursanov", 44, "dastan@gmail.com", "+996708289673"),
                new Person(55, "Janysh", "Atabekov", 51, "janysh@gmail.com", "+996708237090")
        };

        Address[] addresses = {
                new Address(77, Country.KYRGYZSTAN, City.BISHKEK, "Jal"),
                new Address(77, Country.KYRGYZSTAN, City.OSH, "Vostok-5"),
                new Address(77, Country.KYRGYZSTAN, City.BISHKEK, "Asanbai"),
        };

        Home[] house = {
                new House(1, "Ixlas", "Jal", 20000, 10, people),
                new House(1, "Avangard", "Vostok-5", 40000, 15, people),
                new House(1, "Ixsan", "Asanbai", 30000, 12, people)
        };

        Home[] apartments = {
                new Apartment(2, "PentHouse", "Asanbai", 35000, 8, people),
                new Apartment(2, "Kut", "Jal", 2500, 11, people)
        };


        getPeople(people);
        getAddress(addresses);
        sortHomeByPrice(house, apartments);

        getHouseByCity(addresses, house);
        getApartmentByCity(addresses, apartments);

    }

    public static void getPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);

        }
    }

    public static void getAddress(Address[] addresses) {
        for (Address address : addresses) {
            System.out.println(address);
        }

    }

    public static void sortHomeByPrice(Home[] homes, Home[] apartments) {
        int counter = 0;
        int counter1 = 0;
        for (Home home : homes) {
            if (home.getPrice() > counter) {
                counter = home.getPrice();

            }
        }
        System.out.println(counter);

        for (Home apartment : apartments) {
            if (apartment.getPrice() > counter1) {
                counter1 = apartment.getPrice();

            }
        }
        System.out.println(counter1);
    }

    public static void getHouseByCity(Address[] addresses, Home[] homes) {

        for (Address address : addresses) {
            for (Home home : homes) {
                if (address.getAddress().equals(home.getAddress())) {
                    System.out.println(address.getCountry() + " " + address.getCity() + " " + home.getAddress() + " " + home.getTitle());
                }
            }
        }

    }

    public static void getApartmentByCity(Address[] addresses, Home[] apartments) {
        for (Address address : addresses) {
            for (Home apartment : apartments) {
                if (address.getAddress().equals(apartment.getAddress())) {
                    System.out.println(address.getCountry() + " " + address.getCity() + " " + apartment.getAddress() + " " + apartment.getTitle());
                }
            }
        }
    }

    public static void getPeopleInTheHouse() {

    }
}
