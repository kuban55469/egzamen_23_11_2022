package egzamen_1.transport;

public class Bus extends Transport {
    public Bus(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    public void fuelConsumption(String fuel, int liter) {
        System.out.println(getName() + " fuel is: " + fuel + " Max liter is: " + liter);
    }

    @Override
    public void fly() {

    }
}
