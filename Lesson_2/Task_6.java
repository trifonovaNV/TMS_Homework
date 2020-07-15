import java.util.Scanner;
/*
    6) Даны 2 числа. Вывести большее из них
*/
public class Task_6 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int first, second;
        first = scanner.nextInt();
        second = scanner.nextInt();
        if (first >= second){
            System.out.println("Bigger number: " + first);
        }
        else {
            System.out.println("Bigger number: " + second);
        }
    }
}
