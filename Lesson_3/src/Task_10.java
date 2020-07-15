import java.util.Random;

public class Task_10 {
    /*
    Имеется целове число (задать с помощью Random rand = new Random(); int x = rand.nextInt() ).
    Это число – количесво денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.
     */
    public static void main(String[] args) {
        int money;
        Random random = new Random();
        money = random.nextInt();
        if (Math.abs(money) % 100 >= 11 && Math.abs(money) % 100 <= 14) {
            System.out.println(money + " рублей.");
        } else {
            int lastDigit = Math.abs(money) % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println(money + " рублей.");
                    break;
                case 1:
                    System.out.println(money + " рубль.");
                    break;
                case 2:
                    System.out.println(money + " рубля.");
                    break;
                case 3:
                    System.out.println(money + " рубля.");
                    break;
                case 4:
                    System.out.println(money + " рубля.");
                    break;
                case 5:
                    System.out.println(money + " рублей.");
                    break;
                case 6:
                    System.out.println(money + " рублей.");
                    break;
                case 7:
                    System.out.println(money + " рублей.");
                    break;
                case 8:
                    System.out.println(money + " рублей.");
                    break;
                case 9:
                    System.out.println(money + " рублей.");
                    break;
                default:
                    break;
            }
        }
    }
}
