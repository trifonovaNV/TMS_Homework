import java.util.Scanner;
/*
    4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
*/
public class Task_4 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int counter = 3, counterOfPositive = 0;
        while (counter > 0){
            int number = scanner.nextInt();
            if (number > 0){
                counterOfPositive++;
            }
            counter--;
        }
        System.out.println("Positive numbers: " + counterOfPositive);
    }

}
