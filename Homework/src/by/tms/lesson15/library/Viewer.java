package by.tms.lesson15.library;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Viewer extends Thread {

    public static Queue<String> actions;
    private static boolean isRun;

    public Viewer() {
        super();
        this.actions = new PriorityBlockingQueue<>();
        this.isRun = true;
    }

    @Override
    public void run() {
        while (isRun) {
            while (actions.size() > 0) {
                System.out.println(actions.poll());
            }
        }
    }

    public static boolean isIsRun() {
        return isRun;
    }

    public static void setIsRun(boolean isRun) {
        Viewer.isRun = isRun;
    }
}
