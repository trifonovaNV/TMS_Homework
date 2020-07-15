public class Task_14 {
    /*
    Найдите сумму первых n целых чисел, которые делятся на 3.
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        int sum = 0, counter = 0, nextNumber = 3;
        while (counter != number) {
            sum += nextNumber;
            nextNumber += 3;
            counter++;
        }
        System.out.println("Sum of the first " + number + " numbers, which are divided by 3: " + sum);
    }
}
