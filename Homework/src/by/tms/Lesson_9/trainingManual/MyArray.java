package by.tms.Lesson_9.trainingManual;

public class MyArray<T> {
    private T[] array;

    public MyArray(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }
}
