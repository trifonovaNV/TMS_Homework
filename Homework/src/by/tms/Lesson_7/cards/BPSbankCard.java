package by.tms.Lesson_7.cards;

public class BPSbankCard extends Card {

    protected double commission;

    public BPSbankCard(String name) {
        super(name, "BPS Bank");
        commission = 0.03;
    }

    @Override
    public void withdrawMoney(int money) {
        System.out.println("If you want to withdraw " + money + " USD. You'll get " + money * (1 - commission) + " USD.");
    }

}
