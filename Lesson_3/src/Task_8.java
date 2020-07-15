import java.util.Scanner;

/*
Создайте число. Определите, является ли число трехзначным.
Определите, является ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Task_8 {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        boolean isThreeDigit = false, isLastSeven = false, isEven = false;
        if (number >= 100 && number <= 999) {
            isThreeDigit = true;
        }
        if (number % 10 == 7) {
            isLastSeven = true;
        }
        if (number % 2 == 0) {
            isEven = true;
        }
        System.out.println("Your number is "
                + (isThreeDigit ? "3-digit, " : "not 3-digit, ")
                + (isLastSeven ? "with 7 at the end" : "without 7 at the end")
                + (isEven ? " and even." : " and odd."));
    }
}
