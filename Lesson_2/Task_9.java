import java.util.Scanner;
/*
    Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n.
*/
public class Task_9 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number, reverse = 0, counter = 3;
        number = scanner.nextInt();
        while (number > 0){
            reverse += number % 10 * Math.pow (10,counter);
            number /= 10;
            counter--;
        }
        System.out.println("Reverse number: " + reverse);
    }
}
