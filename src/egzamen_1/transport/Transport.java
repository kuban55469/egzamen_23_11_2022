package egzamen_1.transport;

import egzamen_1.animal.FlyAble;

public abstract class Transport implements TransportInterface, FlyAble {

    private String name;
    private int year;
    private TransportType transportType;

    public Transport(String name, int year, TransportType transportType) {
        this.name = name;
        this.year = year;
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", transportType=" + transportType +
                '}';
    }
}
