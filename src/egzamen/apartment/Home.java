package egzamen.apartment;

import egzamen.person.Person;

import java.util.Arrays;

public abstract class Home {
    /*
    Id, title, address, price, maxGuest,
        people.
     */

    private int id;
    private String title;
    private String address;

    private int price;
    private int maxGuest;
    private Person[] people;

    public Home(int id, String title, String address, int price, int maxGuest, Person[] people) {
        this.id = id;
        this.title = title;
        this.address = address;
        if (price > 0) {
            this.price = price;
        }
        if (maxGuest > 0) {
            this.maxGuest = maxGuest;
        }
        this.people = people;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }


    public abstract void service();

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", maxGuest=" + maxGuest +
                ", people='" + Arrays.toString(people) + '\'' +
                '}';
    }
}
