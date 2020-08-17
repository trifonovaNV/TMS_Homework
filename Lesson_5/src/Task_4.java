public class Task_4 {
    /*
    Напишите три цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String,
    другой с помощью StringBuilder и метода append, а также аналогино для StringBuffer.
    Сравните скорость их выполнения.
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += i;
        }
        long finishTime = System.currentTimeMillis();
        long workTime = finishTime - startTime;
        System.out.println(" Time of String's work: " + workTime);

        startTime = System.currentTimeMillis();
        result = "";
        StringBuilder builder = new StringBuilder(result);
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
        }
        finishTime = System.currentTimeMillis();
        workTime = finishTime - startTime;
        System.out.println(" Time of StringBuilder's work: " + workTime);

        startTime = System.currentTimeMillis();
        result = "";
        StringBuffer buffer = new StringBuffer(result);
        for (int i = 0; i < 1000; i++) {
            buffer.append(i);
        }
        finishTime = System.currentTimeMillis();
        workTime = finishTime - startTime;
        System.out.println(" Time of StringBuffer's work: " + workTime);
    }
}
