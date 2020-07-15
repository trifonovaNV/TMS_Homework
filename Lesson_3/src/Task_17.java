public class Task_17 {
    /*
    Создать массив, заполнить его случайными элементами,
    распечатать, перевернуть, и снова распечатать
    (при переворачивании нежелательно создавать еще один массив).
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("New array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
