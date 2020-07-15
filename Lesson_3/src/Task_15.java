public class Task_15 {
    /*
    Создать последовательность случайных чисел, найти и вывести наибольшее из них.
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Max number is " + array[array.length - 1]);
    }
}
