package oop.inharitance;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal(30, 300, 190);
        System.out.println(animal1);
        animal1.makeNoise();

        Dog rex = new Dog(40, 30, 100, "rex", "black", "hav hav");
        Dog alex = new Dog(30, 100, 120, "Alex", "yellow", "hrr hrr");
        rex.setWeight(10);
        System.out.println(rex);
        rex.makeNoise();


        System.out.println(alex);
        alex.makeNoise();
    }
}
