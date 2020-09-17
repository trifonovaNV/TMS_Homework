package by.tms.lesson15.library;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@NoArgsConstructor
public class Client extends Thread {

    private String name;
    private List<Book> books;

    public Client(String name) {
        super();
        this.name = name;
        this.books = new ArrayList<>();
    }

    public synchronized void takeBook(int number) {
        Book selectedBook = Library.books.get(number);
        if (selectedBook.isAvailable()) {
            Library.books.get(number).setAvailable(false);
            this.books.add(selectedBook);
            Viewer.actions.add(this.name + " took " + selectedBook.getName());
        } else {
            Viewer.actions.add("Sorry, " + this.name + ", book " + selectedBook.getName() + " has already been taken.");
        }
    }

    public synchronized void takeBookHome(int number) {
        Book selectedBook = Library.books.get(number);
        if (!selectedBook.isOnlyReadingRoom()) {
            if (selectedBook.isAvailable()) {
                Library.books.get(number).setAvailable(false);
                this.books.add(selectedBook);
                Viewer.actions.add(this.name + " took " + selectedBook.getName() + " home");
            } else {
                Viewer.actions.add("Sorry, " + this.name + ", book " + selectedBook.getName() + " has already been taken.");
            }
        } else {
            Viewer.actions.add("Sorry, " + this.name + ", you can't take book " + selectedBook.getName() + " home.");
        }
    }

    public synchronized void returnBook(int number) {
        Book selectedBook = this.books.get(number);
        int indexOfBook = Library.books.indexOf(selectedBook);
        Library.books.get(indexOfBook).setAvailable(true);
        this.books.remove(selectedBook);
        Viewer.actions.add(this.name + " return " + selectedBook.getName());
    }

    public void readBook(Book book) {
        Viewer.actions.add(this.name + " reads " + book.getName());
        try {
            Thread.sleep(new Random().nextInt(3000) + 3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int countOfActions = 10;
        while (countOfActions != 0) {
            int choice = new Random().nextInt(4) + 1;
            switch (choice) {
                case 1: {
                    int numberOfBook = new Random().nextInt(Library.books.size() - 1);
                    if (!this.books.contains(Library.books.get(numberOfBook))) {
                        takeBook(numberOfBook);
                    } else {
                        continue;
                    }
                    break;
                }
                case 2: {
                    if (this.books.size() != 0) {
                        if (this.books.size() == 1) {
                            returnBook(0);
                        } else {
                            returnBook(new Random().nextInt(this.books.size() - 1));
                        }
                    } else {
                        continue;
                    }
                    break;
                }
                case 3: {
                    if (this.books.size() != 0) {
                        if (this.books.size() == 1) {
                            readBook(this.books.get(0));
                        } else {
                            readBook(this.books.get(new Random().nextInt(this.books.size() - 1)));
                        }
                    } else {
                        continue;
                    }
                    break;
                }
                case 4: {
                    int numberOfBook = new Random().nextInt(Library.books.size() - 1);
                    if (!this.books.contains(Library.books.get(numberOfBook))) {
                        takeBookHome(numberOfBook);
                    } else {
                        continue;
                    }
                    break;
                }
                default:
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countOfActions--;
        }
    }
}
