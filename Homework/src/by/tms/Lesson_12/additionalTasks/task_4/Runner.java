package by.tms.Lesson_12.additionalTasks.task_4;

import java.io.*;

public class Runner {
    /*
    4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
    сериализации произвести обратный процесс
     */
    public static void main(String[] args) {
        Car car = new Car("Porshe", 200, 100000);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("/Users/trifonovanv/Desktop/TeachMeSkills/TMS_Homework/Homework/src/" +
                    "by/tms/Lesson_12/additionalTasks/task_4/output.dat"));
            out.writeObject(car);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Original car - " + car);

        Car newCar = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("/Users/trifonovanv/Desktop/TeachMeSkills/TMS_Homework/Homework/src/" +
                    "by/tms/Lesson_12/additionalTasks/task_4/output.dat"));
            newCar = (Car) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("New car - " + newCar);
    }
}
