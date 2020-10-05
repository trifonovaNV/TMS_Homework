package by.tms.lesson15.exchanger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@AllArgsConstructor
public class Client extends Thread {

    private String name;
    private Exchanger exchanger;

    public void buyMoney(String currency, int sum) {
        synchronized (exchanger) {
            if (exchanger.getMaxBuyMoney() > sum) {
                if (exchanger.getMoney().get(currency) >= sum) {
                    exchanger.decreaseMoney(currency, sum);
                    Viewer.actions.add(exchanger.getBank() + ": " + name + " buy " + sum + " " + currency + "\n" +
                            "------ " + exchanger.getBank() + ": " + exchanger.getMoney().get("USD") + " USD, "
                            + exchanger.getMoney().get("EUR") + " EUR. ------");
                } else {
                    Viewer.actions.add(exchanger.getBank() + ": sorry, " + name + ", you can't buy this amount of money.");
                }
            } else {
                Viewer.actions.add(exchanger.getBank() + ": sorry, " + name + ", you can't buy " + sum + " " + currency
                        + ", because your amount of money is bigger than permitted.");
            }
        }
    }

    public void sellMoney(String currency, int sum) {
        synchronized (exchanger) {
            if (exchanger.getMaxSellMoney() > sum) {
                if (exchanger.getMoney().get(currency) + sum < exchanger.getMaxAmountOfMoney()) {
                    exchanger.increaseMoney(currency, sum);
                    Viewer.actions.add(exchanger.getBank() + ": " + name + " sell " + sum + " " + currency + "\n" +
                            "------ " + exchanger.getBank() + ": " + exchanger.getMoney().get("USD") + " USD, "
                            + exchanger.getMoney().get("EUR") + " EUR. ------");
                } else {
                    Viewer.actions.add(exchanger.getBank() + ": sorry, " + name + ", you can't sell this amount of money.");
                }
            } else {
                Viewer.actions.add(exchanger.getBank() + ": sorry, " + name + ", you can't sell " + sum + " " + currency
                        + ", because your amount of money is bigger than permitted.");
            }
        }
    }

    @Override
    public void run() {
        int countOfActions = 2;
        while (countOfActions > 0) {
            int choice = new Random().nextInt(2) + 1;
            switch (choice) {
                case 1: {
                    String currency = new Random().nextDouble() > 0.5 ? "USD" : "EUR";
                    int sum = new Random().nextInt(1500) + 1;
                    buyMoney(currency, sum);
                    break;
                }
                case 2: {
                    String currency = new Random().nextDouble() > 0.5 ? "USD" : "EUR";
                    int sum = new Random().nextInt(2500) + 1;
                    sellMoney(currency, sum);
                    break;
                }
                default:
                    break;
            }
            countOfActions--;
        }
    }
}
