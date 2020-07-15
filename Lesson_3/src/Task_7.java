public class Task_7 {
    /*
    Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
     */
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 99; i += 2) {
            result += i;
        }
        System.out.println("1 + 3 + 5 + ... + 99 = " + result);
    }
}
