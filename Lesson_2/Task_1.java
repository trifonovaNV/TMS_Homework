import java.util.Scanner;
/*
    1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
    и положительное оно или отрицательное. Например, "это однозначное положительное число".
    Достаточно будет определить, является личисло однозначным, двухзначным или трехзначным и более.
*/
public class Task_1 {

    public static void main (String[] args){
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPositive;
        if (number >= 0){
            isPositive = true;
        } else{
            isPositive = false;
        }
        int counter = 1;
        while (Math.abs(number) >= 10){
            counter++;
            number /= 10;
        }
        if (isPositive) {
            System.out.println("It's a " + counter + "-digit positive number.");
        }
        else {
            System.out.println("It's a " + counter + "-digit negative number.");
        }
    }

}
