package by.tms.lesson12.additionalTasks.task_4;

import java.io.*;

public class Runner {
    /*
    4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
    сериализации произвести обратный процесс
     */
    public static void main(String[] args) {
        Car car = new Car("Porshe", 200, 100000);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/by/tms/lesson12/additionalTasks/task_4/output.dat"))) {
            out.writeObject(car);
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
        System.out.println("Original car - " + car);

        Car newCar = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/by/tms/lesson12/additionalTasks/task_4/output.dat"))) {
            newCar = (Car) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return;
        }
        System.out.println("New car - " + newCar);
    }
}
