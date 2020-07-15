public class Task_18 {
    /*
    Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int minPlace = 0, maxPlace = 0, minNumber = array[0], maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxPlace = i;
            }
            if (array[i] < minNumber) {
                minNumber = array[i];
                minPlace = i;
            }
        }
        System.out.println("Max number is " + maxNumber + " on " + (maxPlace + 1) + " place");
        System.out.println("Min number is " + minNumber + " on " + (minPlace + 1) + " place");
        int sum = 0;
        if (minPlace < maxPlace) {
            for (int i = minPlace + 1; i < maxPlace; i++) {
                sum += array[i];
            }
        } else {
            for (int i = maxPlace + 1; i < minPlace; i++) {
                sum += array[i];
            }
        }
        System.out.println("Sum of numbers, which are between min and max elements are " + sum);
    }
}
