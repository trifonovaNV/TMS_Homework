public class Task_5 {
    /*
    Напишите программу печати таблицы перевода расстояний из дюймов в
    сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            double centimeters = i * 2.54;
            System.out.println(i + "\t inches = " + centimeters + "\t centimeters");
        }
    }
}
