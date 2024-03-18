package oop;

public class Account {
    private int id;
    private String Name;
    private String Surname;
    private String Email;
    private int currentMoney;

    public Account() {
    }

    public String toString() {
        return "Account(id=" + this.getId() + ", customerName=" + this.getName() + ", customerSurname=" + this.getSurname() + ", customerEmail=" + this.getEmail() + ", currentMoney=" + this.getCurrentMoney() + ")";
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.Name;
    }

    public String getSurname() {
        return this.Surname;
    }

    public String getEmail() {
        return this.Email;
    }

    public int getCurrentMoney() {
        return this.currentMoney;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account(int id, String customerName, String Surname, String Email, int currentMoney) {
        this.id = id;
        this.Name = customerName;
        this.Surname = Surname;
        this.Email = Email;
        this.currentMoney = Math.max(currentMoney, 0);

    }

    public void setName(String name) {
        this.Name = name;
    }

    public void drawMoney(int money) {
        if (this.currentMoney > money) {
            this.currentMoney -= money;
            System.out.println("Please wait... ... ...");
            System.out.println("Your new balance is equal to : " + this.currentMoney);
        } else {
            System.out.println("You don't have that much money");
        }
    }

    public void depositMoney(int money) {
        this.currentMoney += money;
        System.out.println("Please wait... ... ...");
        System.out.println("Your new balance is equal to : " + this.currentMoney);
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    }

