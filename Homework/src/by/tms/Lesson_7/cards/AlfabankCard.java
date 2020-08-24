package by.tms.Lesson_7.cards;

public class AlfabankCard extends Card {

    protected double commission;

    public AlfabankCard(String name) {
        super(name, "Alfa bank");
        commission = 0.01;
    }

    @Override
    public void withdrawMoney(int money) {
        System.out.println("If you want to withdraw " + money + " USD. You'll get " + money * (1 - commission) + " USD.");
    }

}
