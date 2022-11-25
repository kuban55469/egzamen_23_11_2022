package egzamen.apartment;

import egzamen.apartment.Home;
import egzamen.apartment.House;
import egzamen.person.Person;

public class House extends Home {
    public House(int id, String title, String address, int price, int maxGuest, Person[] people) {
        super(id, title, address, price, maxGuest, people);
    }

    @Override
    public void service() {

    }
    public String getPeopleOfBig(){
        return null;
    }
}