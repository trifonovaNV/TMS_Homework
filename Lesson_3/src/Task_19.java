public class Task_19 {
    /*
    Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
    11111
    01110
    00100
    01110
    11111
     */
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length - i; j++) {
                array[i][j] = 1;
            }
            for (int j = array[i].length - i - 1; j <= i; j++) {
                array[i][j] = 1;
            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
