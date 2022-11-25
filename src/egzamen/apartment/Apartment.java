package egzamen.apartment;

import egzamen.person.Person;

public class Apartment extends Home{

    public Apartment(int id, String title, String address, int price, int maxGuest, Person[] people) {
        super(id, title, address, price, maxGuest, people);
    }

    @Override
    public void service() {

    }
    public String getAddress(){

        return null;
    }
}
