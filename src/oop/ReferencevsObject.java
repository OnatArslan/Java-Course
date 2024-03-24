package oop;

import org.w3c.dom.ls.LSOutput;

public class ReferencevsObject {
    public static void main(String[] args) {
        HouseReferance redHouse = new HouseReferance("Firsthouse", "mugla", "red");
        HouseReferance copyhouse = redHouse;
        copyhouse.setColor("blue");
        System.out.println(redHouse.toString()); // blue that because copyhouse isn't a new house this is just an referance or copy
        System.out.println(copyhouse.toString()); //  blue
        HouseReferance greenHouse = new HouseReferance("sec house", "ankara", "green");
        copyhouse = greenHouse;
        System.out.println(redHouse.toString()); // blue
        System.out.println(copyhouse.toString()); // green
        System.out.println(greenHouse.toString()); // green
    }


}
