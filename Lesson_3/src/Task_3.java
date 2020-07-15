public class Task_3 {
    /*
    Вычислить: 1+2+4+8+...+2564
     */
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 2564; i *= 2) {
            result += i;
        }
        System.out.println("1+2+4+8+...+2564 = " + result);
    }
}
