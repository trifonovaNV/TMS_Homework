package by.tms.Lesson_9.trainingManual;

public class Runner {
/*
    Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
    Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
*/
    public static void main(String[] args) {
        String[] strings = {"Alisa", "Sasha", "Sonya", "Vanya"};
        MyArray<String> stringArray = new MyArray<String>(strings);
        String name = stringArray.get(2);
        System.out.println(name);

        Integer[] numbers = {0, 1, 2, 3, 4};
        MyArray<Integer> intArray = new MyArray<Integer>(numbers);
        Integer number = intArray.get(1);
        System.out.println(number);

        Double[] doubles = {9.76, 3.85, 10.54, 19.83};
        MyArray<Double> doubleArray = new MyArray<Double>(doubles);
        Double doubleNumber = doubleArray.get(3);
        System.out.println(doubleNumber);

    }
}
