package by.tms.Lesson_10.library;

public class Book {
    /*
    Создать класс Книга, поля:
    • id (целое число)
    • title (строка)
    • genre (строка)
    (Если вы уже в себе уверены, создавайте еще один класс Genre и в класс Book вмест genre включайте genreId,
    который будет ссылаться на жанр с соответствующим id)
     */
    private int id;
    private String title;
    private String genre;

    public Book(int id, String title, String genre){
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", title: " + title + ", genre: " + genre + ".";
    }
}
