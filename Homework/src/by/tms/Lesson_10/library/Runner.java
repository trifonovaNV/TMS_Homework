package by.tms.Lesson_10.library;

public class Runner {
    /*
    (обязательное): В main:
    • создаем объект библиотеки
    • создаем пару тройку книг и добавляем эти книги в библиотеку
    • получаем список книг из библиотеки, сортируем по полю title (по названию книги) и выводим в консоль.
    • удаляем одну книгу
    • получаем список книг из библиотеки, сортируем по порядку добавления (последние добавленные в начале) и выводим в консоль.
    • редактируем одну книгу
    • получаем список книг и выводим в консоль
     */

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }
}