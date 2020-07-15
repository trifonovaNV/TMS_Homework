import java.util.Scanner;

public class Task_4 {
    /*
    Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        scanner.close();
        int result = 0;
        if (a <= b) {
            for (int i = 0; i < a; i++) {
                result += b;
            }
        } else {
            for (int i = 0; i < b; i++) {
                result += a;
            }
        }
        System.out.println("A * B = " + result);
    }
}
