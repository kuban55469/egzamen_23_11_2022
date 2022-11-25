package egzamen_1.animal;

public abstract class Animal implements AnimalInterface, FlyAble {
    private String name;
    private int speed;
    private AnimalType animalType;

    public Animal(String name, int speed, AnimalType animalType) {
        this.name = name;
        this.speed = speed;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", animalType=" + animalType +
                '}';
    }
}
