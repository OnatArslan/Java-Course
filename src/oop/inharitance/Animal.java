package oop.inharitance;

public class Animal {
    public int speed;
    public int weight;
    public int tall;
    public Animal(int speed, int weight, int tall) {  //Constructor
        this.speed = speed;
        this.weight = weight;
        this.tall = tall;
    }

    public void makeNoise() {
        System.out.println("Unknown animal making noises mrhhh");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", tall=" + tall +
                '}';
    }
}
