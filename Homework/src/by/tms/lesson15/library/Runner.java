package by.tms.lesson15.library;

public class Runner {

    /*
    1)Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг. Некоторые из них
    можно выдавать на руки некоторые - только в читальный зал. Посетители могут брать одновременно по несколько
    книг на руки и в читальный зал.
     */

    public static void main(String[] args) {
        Library library = new Library();
        Thread viewer = new Viewer();
        viewer.start();

        ParserXML.start(library);
        Library.showAllBooks();

        Thread firstClient = new Client("Trifonova Nadya");
        Thread secondClient = new Client("Rahlina Anna");

        firstClient.start();
        secondClient.start();

        try {
            firstClient.join();
            secondClient.join();
            Viewer.setIsRun(false);
            viewer.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
