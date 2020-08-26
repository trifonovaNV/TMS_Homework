package by.tms.Lesson_10.library;

import java.util.ArrayList;

public class Library {
    /*
    Создать класс Библиотека,
     поля:
    • Список книг (изначально пустой)
    методы:
    • добавить книгу (принимает объект книги и добавляет его в список товаров).
    При попытке добавить кигу с id уже существующем в списке, вставка производится не должна
    • получить все книги (метод ВОЗВРАЩАЕТ список всех книг в библиотеке)
    • удалить книгу (метод принимает id книги и удаляет из списка книгу с соответствующим id)
    • редактировать книгу (принимает объект книги и редактирует их список товаров)
    */
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        for (Book it : books) {
            if (it.getId() == book.getId()) {
                System.err.println("You can't add this book to the Library, because this book has the same ID with the other book.");
                return;
            }
        }
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void deleteBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                return;
            }
        }
        System.err.println("There is no such book.");
    }

    public void editBook(Book book){
        for (Book it : books) {
            if (it.getId() == book.getId()) {
                it.setTitle(book.getTitle());
                it.setGenre(book.getGenre());
                return;
            }
        }
        System.err.println("There is no such book.");
    }
}
