import java.util.Scanner;

/*
    7)  В переменную записываете количество программистов. В зависимости
    от количества программистов необходимо вывести правильно окончание.
    Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
*/
public class Task_7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number;
        number = scanner.nextInt();
        if (number % 100 > 10 && number % 100 < 15) {
            System.out.println(number + " программистов");
        } else {
            int digit;
            digit = number % 10;
            switch (digit){
                case 0:
                    System.out.println(number + " программистов");
                    break;
                case 1:
                    System.out.println(number + " программист");
                    break;
                case 2:
                    System.out.println(number + " программистa");
                    break;
                case 3:
                    System.out.println(number + " программистa");
                    break;
                case 4:
                    System.out.println(number + " программистa");
                    break;
                case 5:
                    System.out.println(number + " программистов");
                    break;
                case 6:
                    System.out.println(number + " программистов");
                    break;
                case 7:
                    System.out.println(number + " программистов");
                    break;
                case 8:
                    System.out.println(number + " программистов");
                    break;
                case 9:
                    System.out.println(number + " программистов");
                    break;
                default:
                    break;
            }
        }
    }
}
