package oop;

public class MainAccount {
    public static void main(String[] args) {
        Account acc1 = new Account(1, "Onat", "Arslan", "onat@gmail.com", 120000);
        acc1.depositMoney(10000);
        acc1.drawMoney(200000);
        acc1.setName("Ruya");
        acc1.setSurname("Cataroglu");
        System.out.println(acc1.toString());
    }
}
