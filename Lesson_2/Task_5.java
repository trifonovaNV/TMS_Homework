import java.util.Scanner;
/*
    5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
*/
public class Task_5 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int counter = 3, counterOfPositive = 0, counterOfNegative = 0;
        while (counter > 0){
            int number = scanner.nextInt();
            if (number > 0){
                counterOfPositive++;
            }
            else if (number < 0){
                counterOfNegative++;
            }
            counter--;
        }
        System.out.println("Positive numbers: " + counterOfPositive);
        System.out.println("Negative numbers: " + counterOfNegative);
    }

}
