public class Task_12 {
    /*
    Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию)
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 5 + 10);
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Number: " + number);
        System.out.println("Factorial: " + factorial);
    }
}
