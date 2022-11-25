package egzamen_1.animal;

public class Horse extends Animal{
    public Horse(String name, int speed, AnimalType animalType) {
        super(name, speed, animalType);
    }

    @Override
    public void run() {
        System.out.println("Horse name is: " + getName() + " running " + getSpeed() + " km/h");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eating only: " + food);
    }

    @Override
    public void fly() {
    }
}
