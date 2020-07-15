import java.util.Scanner;
/*
    Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
 */
public class Task_10 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number;
        int [] mas = new int [10];
        boolean isDifferent = true;
        number = scanner.nextInt();
        while (number > 0){
            mas[number % 10]++;
            number /= 10;
        }
        for (int i : mas){
            if (i > 1){
                isDifferent = false;
                break;
            }
        }
        if (isDifferent) {
            System.out.println("All digits are different.");
        }
        else {
            System.out.println("Not all digits are different.");
        }
    }

}
