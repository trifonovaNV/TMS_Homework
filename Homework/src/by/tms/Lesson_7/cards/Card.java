package by.tms.Lesson_7.cards;

import java.util.Random;

public abstract class Card {

    private int cardNumber;
    private String name;
    private String bank;
    private int securityCode;

    public Card(String name, String bank) {
        this.bank = bank;
        cardNumber = new Random().nextInt(899999) + 100000;
        this.name = name;
        securityCode = new Random().nextInt(899) + 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public String toString() {
        return "Number: " + this.cardNumber + ", name: " + this.name + ", code: " + this.securityCode +
                ", bank: " + bank;
    }

    public abstract void withdrawMoney(int money);

}
