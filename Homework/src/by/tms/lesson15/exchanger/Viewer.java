package by.tms.lesson15.exchanger;

import lombok.Getter;
import lombok.Setter;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

@Setter
@Getter
public class Viewer extends Thread {

    public static Queue<String> actions;
    private boolean isRun;

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
}
