package by.tms.lesson15.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {

    /*
    2) Написать клиент для работы обменника. Люди могут подходить к обменнику чтобы купить/продать доллары или ЕВРО.
     Количество долларов и ЕВРО в обменнике не должно превышать какого-то заранее заданного предела и не должно
     оказаться меньше нуля. Каждый человек так же не может купить или продать долларов или ЕВРО больше, чем какое-то
     определенное значение. В нашей программе, имитирующей торговый центр, работает несколько обменников. Одновременно
      в одном обменнике может находится только один человек.
     */

    public static void main(String[] args) {

        Viewer viewer = new Viewer();
        viewer.start();

        Exchanger exchangerBSB = new Exchanger("BSB");
        Exchanger exchangerMTB = new Exchanger("MTB");

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Rakhlina Anna", chosenExchanger(exchangerBSB, exchangerMTB)));
        clients.add(new Client("Shilyaev Ivan", chosenExchanger(exchangerBSB, exchangerMTB)));
        clients.add(new Client("Trifonova Nadya", chosenExchanger(exchangerBSB, exchangerMTB)));
        clients.add(new Client("Popova Anna", chosenExchanger(exchangerBSB, exchangerMTB)));
        clients.add(new Client("Alexin Sasha", chosenExchanger(exchangerBSB, exchangerMTB)));
        clients.add(new Client("Belkina Dasha", chosenExchanger(exchangerBSB, exchangerMTB)));

        for (Client client : clients) {
            client.start();
        }

        try {
            for (Client client : clients) {
                client.join();
            }
            viewer.setRun(false);
            viewer.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

    }

    public static Exchanger chosenExchanger(Exchanger firstExchanger, Exchanger secondExchanger) {
        return new Random().nextDouble() > 0.5 ? firstExchanger : secondExchanger;
    }
}
