package oop.pojo;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            LPMStudent s = new LPMStudent("S92300" + i, switch (i) {
                case 1 -> "Marry";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }
                    , "05/11/1985", "JavaMasterClass");
            System.out.println(s); // We don't need to use toString method because println first run toString method
        }
    }
}
