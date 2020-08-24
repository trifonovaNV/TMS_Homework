package by.tms.Lesson_7.space;

public class Cosmodrome {
    public Cosmodrome() {

    }

    void starting(IStart iStart) {
        if (iStart.checkingSystem()) {
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена.");
        }
        System.out.println();
    }
}
