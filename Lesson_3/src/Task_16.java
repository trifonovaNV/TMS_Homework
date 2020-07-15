public class Task_16 {
    /*
    Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
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
                maxPlace = i + 1;
            }
            if (array[i] < minNumber) {
                minNumber = array[i];
                minPlace = i + 1;
            }
        }
        System.out.println("Max number is " + maxNumber + " on " + maxPlace + " place");
        System.out.println("Min number is " + minNumber + " on " + minPlace + " place");
    }
}
