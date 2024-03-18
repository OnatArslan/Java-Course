package oop;

public class Car {

    private String make = "Tesla";
    private String model = "ModelX";
    private String color = "Red";
    private int doors = 4;
    private boolean convertible = true;

    public Car() {
    }

    public Car(String make, String model, String color, int doors, boolean convertible) {
        this.make = make.toLowerCase();
        this.model = model.toLowerCase();
        this.color = color.toLowerCase();
        this.doors = doors;
        this.convertible = convertible;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) {
            make = "Unknown";
        }
        String lowerMake = make.toLowerCase();
        switch (lowerMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "unsupported";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", convertible=" + convertible +
                '}';
    }

}
