package by.tms.Lesson_6;

/*
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен
задаваться тремя свойствами: количеством купюр номиналом 20 50 100. Сделать методы для
добавления денег в банкомат. Сделать функцию снимающую деньги. На вход передается сумма денег.
На выход – булевское значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать конструктор
с тремя параметрами – количеством купюр.
*/

public class ATM {

    private int twenty;
    private int fifty;
    private int hundred;

    public ATM(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
    }

    public int allMoney() {
        return twenty * 20 + fifty * 50 + hundred * 100;
    }

    public boolean isPossible(int money) {
        int copy = money;
        if (copy % 100 != 0) {
            copy %= 100;
            if (copy % 50 != 0) {
                copy %= 50;
                if (copy % 20 != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void addMoney(int twenty, int fifty, int hundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundred += hundred;
    }

    public boolean withdrawMoney(int money) {
        if (isPossible(money) && allMoney() > money) {
            int countOfHundred, countOfFifty, countOfTwenty;

            countOfHundred = money / 100;
            if (countOfHundred < this.hundred) {
                this.hundred -= countOfHundred;
                money %= 100;
            } else {
                money -= this.hundred * 100;
                countOfHundred = this.hundred;
                this.hundred = 0;
            }

            countOfFifty = money / 50;
            if (countOfFifty < this.fifty) {
                this.fifty -= countOfFifty;
                money %= 50;
            } else {
                money -= this.fifty * 50;
                countOfFifty = this.fifty;
                this.fifty = 0;
            }

            countOfTwenty = money / 20;
            this.twenty -= countOfTwenty;

            System.out.println("You'll get: " + countOfHundred + " hundreds, " + countOfFifty + " fifties, " +
                    countOfTwenty + " twenties.");

            return true;
        }
        return false;
    }

    public void printAllBanknotes() {
        System.out.println("There are " + this.hundred + " hundreds, " + this.fifty + " fifties, " +
                this.twenty + " twenties in the ATM.");
    }

    public static void main(String[] args) {
        ATM atm = new ATM(20, 10, 30);
        atm.printAllBanknotes();
        System.out.println();

        System.out.println("I want to withdraw 1540$.");
        if (atm.withdrawMoney(1540)) {
            atm.printAllBanknotes();
        } else {
            System.out.println("It is impossible to withdraw this amount of money. Please, try again.");
        }
        System.out.println();

        System.out.println("I want to withdraw 1670$.");
        if (atm.withdrawMoney(1670)) {
            atm.printAllBanknotes();
        } else {
            System.out.println("It is impossible to withdraw this amount of money. Please, try again.");
        }
        System.out.println();

        System.out.println("I want to withdraw 2000$.");
        if (atm.withdrawMoney(2000)) {
            atm.printAllBanknotes();
        } else {
            System.out.println("It is impossible to withdraw this amount of money. Please, try again.");
        }
        System.out.println();

        System.out.println("I want to add 4 hundreds, 5 fifties, 10 twenties.");
        atm.addMoney(10, 5, 4);
        atm.printAllBanknotes();
        System.out.println();

        System.out.println("I want to withdraw 1000$.");
        if (atm.withdrawMoney(1000)) {
            atm.printAllBanknotes();
        } else {
            System.out.println("It is impossible to withdraw this amount of money. Please, try again.");
        }
        System.out.println();

    }
}
