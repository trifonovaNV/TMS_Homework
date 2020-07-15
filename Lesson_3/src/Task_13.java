public class Task_13 {
    /*
    Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        boolean isSimple = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        System.out.print("Number " + number);
        System.out.println(isSimple ? " is simple." : " isn't simple.");
    }
}
