package egzamen_1.animal;

public class Eagle extends Animal{
    public Eagle(String name, int speed, AnimalType animalType) {
        super(name, speed, animalType);
    }


    @Override
    public void run() {
        System.out.println("Eagle name is: " + getName() + ". Speed is: " + getSpeed() + " km/h");
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " eating only: " + food);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies in the mountains");
    }
}
