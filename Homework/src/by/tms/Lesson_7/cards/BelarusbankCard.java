package by.tms.Lesson_7.cards;

public class BelarusbankCard extends Card {

    protected double commission;

    public BelarusbankCard(String name) {
        super(name, "Belarus bank");
        commission = 0.02;
    }

    @Override
    public void withdrawMoney(int money) {
        System.out.println("If you want to withdraw " + money + " USD. You'll get " + money * (1 - commission) + " USD.");
    }

}
