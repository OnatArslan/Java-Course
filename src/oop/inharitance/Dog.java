package oop.inharitance;

public class Dog extends Animal{
    public String name;
    public String color;
    public String sound;
    public String size;


    public Dog(int speed, int weight, int tall, String name, String color, String sound) {
        super(speed, weight, tall);
        this.name = name;
        this.color = color;
        this.sound = sound;
        this.size = weight < 15 ? "small" : weight < 35 ? "Medium" : "Big";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", sound='" + sound + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
    public void setWeight(int weight) {
        this.weight = weight;
        this.size = weight < 15 ? "small" : weight < 35 ? "Medium" : "Big";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeNoise() {
        System.out.println(this.name + " is sound like "+ this.sound);
    }
}
