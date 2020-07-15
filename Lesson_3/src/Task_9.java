import java.util.Scanner;

public class Task_9 {
    /*
    Имеется прямоугольное отверстие размерами a и b, определить,
     можно ли его полностью закрыть круглой картонкой радиусом r.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width, length, radius;
        System.out.print("Enter width: ");
        width = scanner.nextInt();
        System.out.print("Enter length: ");
        length = scanner.nextInt();
        System.out.print("Enter radius: ");
        radius = scanner.nextInt();
        scanner.close();
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
        System.out.println(diagonal / 2 <= radius ? "Yes, you can." : "No, you can't.");
    }
}
