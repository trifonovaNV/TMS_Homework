package by.tms.Lesson_9.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

public class Runner {
/*
    Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса
    (поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1,
    а кодовое название версии = Nougat).
    Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы,
    переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo), который будет просто
    печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.
    Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует
    - создавать экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo (использовать
    возможности пакета reflection).
 */
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (MyService.class.isAnnotationPresent(Version.class)) {
            MyService service = new MyService();
            service.setName("New service");
            service.setCountOfUsers(new Random().nextInt(99) + 1);

            Method thisClassInfo = MyService.class.getDeclaredMethod("thisClassInfo");
            thisClassInfo.setAccessible(true);
            thisClassInfo.invoke(service);
        } else {
            System.err.println("No annotation!");
        }
    }
}
