package by.tms.lesson15.library;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Data
public class Library {
    public static List<Book> books;
    private static int ID = 100;

    public Library() {
        books = Collections.synchronizedList(new ArrayList<Book>());
    }

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.err.println("There is already this book.");
        }
        books.add(book);
    }

    public static void showAllBooks() {
        for (Book book : books) {
            Viewer.actions.add(book.toString());
        }
    }

    public static void incID() {
        ID += 10;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Library.ID = ID;
    }
}
