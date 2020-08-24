package by.tms.Lesson_7.cards;

public class ForeignBelarusCard extends BelarusbankCard {
    private String currency;

    public ForeignBelarusCard(String name, String currency) {
        super(name);
        this.commission = 0.08;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(int money) {
        System.out.println("If you want to withdraw " + money + " " + currency + ". You'll get "
                + money * (1 - commission) + " " + currency + ".");

    }
}
