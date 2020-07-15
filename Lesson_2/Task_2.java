import java.util.Scanner;
/*
    2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
    Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
    Требуется сравнить длину каждого отрезка - стороны с суммой двух других. Если хотя бы в одном случае
    отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/
public class Task_2 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side lengths");
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        if ( a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle exists.");
        }
        else {
            System.out.println("Triangle doesn't exist.");
        }
    }

}
