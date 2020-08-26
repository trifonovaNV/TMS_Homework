package by.tms.Lesson_10.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Application {

    public Application() {
    }

    public void start() {
        Library library = new Library();
        fillLibrary(library);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the library!");

        int choice = 0;
        while (choice != 5) {
            showOptions();
            try {
                choice = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.err.println("Enter number, please.");
                continue;
            }
            if (choice < 1 || choice > 5) {
                System.err.println("Enter correct number, please.");
                continue;
            }

            switch (choice) {
                case 1:
                    showBooks(scanner, library);
                    break;
                case 2:
                    library.addBook(enterInformation(scanner));
                    break;
                case 3:
                    deleteBook(scanner, library);
                    break;
                case 4:
                    library.editBook(enterInformation(scanner));
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Goodbye! :)");
                    break;
                default:
                    break;
            }
            System.out.println();
        }
    }

    public static void showOptions() {
        System.out.println("Choose option:\n" +
                "1. Show all books;\n" +
                "2. Add book;\n" +
                "3. Delete book;\n" +
                "4. Edit book;\n" +
                "5. Exit.");
    }

    public static void showBooks(Scanner scanner, Library library) {
        int choice = 0;
        while (true) {
            System.out.println("Sort by:\n" +
                    "1. ID;\n" +
                    "2. Title (increase);\n" +
                    "3. Title (decrease);\n" +
                    "4. Genre.");
            try {
                choice = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.err.println("Enter number, please.");
                continue;
            }
            if (choice < 1 || choice > 4) {
                System.err.println("Enter correct number, please.");
                continue;
            }

            ArrayList<Book> books = library.getBooks();
            switch (choice) {
                case 1:
                    Collections.sort(books, new Comparator<Book>() {
                        public int compare(Book o1, Book o2) {
                            return o1.getId() - o2.getId();
                        }
                    });
                    break;
                case 2:
                    Collections.sort(books, new Comparator<Book>() {
                        public int compare(Book o1, Book o2) {
                            return o1.getTitle().compareTo(o2.getTitle());
                        }
                    });
                    break;
                case 3:
                    Collections.sort(books, new Comparator<Book>() {
                        public int compare(Book o1, Book o2) {
                            return o2.getTitle().compareTo(o1.getTitle());
                        }
                    });
                    break;
                case 4:
                    Collections.sort(books, new Comparator<Book>() {
                        public int compare(Book o1, Book o2) {
                            return o1.getGenre().compareTo(o2.getGenre());
                        }
                    });
                    break;
                default:
                    break;
            }
            for (Book book : books) {
                System.out.println(book);
            }
            return;
        }
    }

    public static void deleteBook(Scanner scanner, Library library) {
        int id = 0;
        while (true) {
            System.out.println("Enter ID of the book: ");
            try {
                id = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.err.println("Enter number, please.");
            }
        }
        library.deleteBook(id);
    }

    public static Book enterInformation(Scanner scanner) {
        int id = 0;
        while (true) {
            System.out.println("Enter ID:");
            try {
                id = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.err.println("Enter number, please.");
            }
        }
        scanner.nextLine();
        System.out.println("Enter title:");
        String title = "";
        if (scanner.hasNext()) {
            title = scanner.nextLine();
        }
        System.out.println("Enter genre:");
        String genre = "";
        if (scanner.hasNext()) {
            genre = scanner.nextLine();
        }
        Book newBook = new Book(id, title, genre);
        return newBook;
    }

    public static void fillLibrary(Library library) {
        library.addBook(new Book(170, "Harry Potter", "fantasy"));
        library.addBook(new Book(208, "Sherlock Holmes", "detective"));
        library.addBook(new Book(340, "Red hood", "fairy tale"));
        library.addBook(new Book(460, "A Scandal in Bohemia", "crime novel"));
        library.addBook(new Book(510, "The picture of Dorian Gray", "thriller"));
        library.addBook(new Book(600, "Dracula", "horror"));
    }
}
