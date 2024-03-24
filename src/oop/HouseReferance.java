package oop;

public class HouseReferance {
    private String name;
    private String adress;
    private String color;

    public HouseReferance(String name, String adress, String color) {
        this.name = name;
        this.adress = adress;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HouseReferance{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
