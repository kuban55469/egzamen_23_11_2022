package egzamen_1.transport;

public class Helicopter extends Transport{
    public Helicopter(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    public void fly() {
        System.out.println("Name is: " + getName() + " Fly in the Batken.");
    }

    @Override
    public void fuelConsumption(String fuel, int liter) {
        System.out.println(getName() + " fuel is: " + fuel + " Max liter is: " + liter);
    }
}
