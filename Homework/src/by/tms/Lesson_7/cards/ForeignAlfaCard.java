package by.tms.Lesson_7.cards;

public class ForeignAlfaCard extends AlfabankCard {

    private String currency;

    public ForeignAlfaCard(String name, String currency) {
        super(name);
        this.commission = 0.02;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(int money) {
        System.out.println("If you want to withdraw " + money + " " + currency + ". You'll get "
                + money * (1 - commission) + " " + currency + ".");

    }
}
