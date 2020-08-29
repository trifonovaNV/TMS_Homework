package by.tms.Lesson_7.cards;

import java.util.Scanner;

public class ForeignAlfaCard extends AlfabankCard {

    private String currency;

    public ForeignAlfaCard(String name, String currency) {
        super(name);
        this.commission = 0.02;
        this.currency = currency;
    }

    public void chooseCurrency(Scanner scanner) {
        System.out.println("You can choose new currency: " +
                "\n1.EUR, " +
                "\n2.USD, " +
                "\n3.RUB, " +
                "\n4.GBP.");

        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            System.err.println("Enter correct number, please.");
        }
        while (choice < 1 || choice > 4) {
            try {
                choice = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.err.println("Enter correct number, please.");
                continue;
            }
            if (choice < 1 || choice > 4) {
                System.err.println("Enter correct number, please.");
            }
        }

        switch (choice){
            case 1:
                this.currency = "EUR";
                break;
            case 2:
                this.currency = "USD";
                break;
            case 3:
                this.currency = "RUB";
                break;
            case 4:
                this.currency = "GBP";
                break;
            default: break;
        }
    }

    @Override
    public void withdrawMoney(int money) {
        System.out.println("If you want to withdraw " + money + " " + currency + ". You'll get "
                + money * (1 - commission) + " " + currency + ".");

    }
}
