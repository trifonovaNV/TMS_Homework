package by.tms.lesson15.exchanger;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Setter
@Getter
public class Exchanger {

    private Map<String, Integer> money;
    private String bank;
    private final int maxAmountOfMoney;
    private final int maxSellMoney;
    private final int maxBuyMoney;

    public Exchanger(String bank) {
        this.money = new ConcurrentHashMap<>();
        this.money.put("USD", 5000);
        this.money.put("EUR", 5000);
        this.bank = bank;
        this.maxAmountOfMoney = 10000;
        this.maxSellMoney = 2000;
        this.maxBuyMoney = 1000;
    }

    public void increaseMoney(String currency, int sum) {
        int newValue = money.get(currency) + sum;
        money.replace(currency, newValue);
    }

    public void decreaseMoney(String currency, int sum) {
        int newValue = money.get(currency) - sum;
        money.replace(currency, newValue);
    }
}
