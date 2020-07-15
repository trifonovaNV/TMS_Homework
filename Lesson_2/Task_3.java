import java.util.Scanner;

/*
    3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
    Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
    Вывести полученное число
*/
public class Task_3 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number > 0){
            number++;
        } else if (number < 0){
            number -= 2;
        } else if (number == 0){
            number = 10;
        }
        System.out.println("New number: " + number);
    }

}
