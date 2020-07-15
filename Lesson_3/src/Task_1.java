public class Task_1 {
    /*
    1)Начав тренировки, спортсмен в первый день пробежал 10 км.
    Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
     Какой суммарный путь пробежит спортсмен за 7 дней?
     */
    public static void main(String[] args) {
        double kilometers = 10, norma = 10;
        for (int i = 1; i < 7; i++) {
            norma *= 1.1;
            kilometers += norma;
        }
        System.out.println("He will run " + kilometers + " kilometers.");
    }
}
