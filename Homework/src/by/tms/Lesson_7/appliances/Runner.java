package by.tms.Lesson_7.appliances;

/*
Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов
описанных классов, часть из них включить в розетку.
 */

public class Runner {

    public static void main(String[] args) {
        Appliances[] appliances = new Appliances[4];
        appliances[0] = new Kettle("DeLongi");
        appliances[1] = new VacuumCleaner("Dyson");
        appliances[2] = new Blender("Braun");
        appliances[3] = new Washer("Bosch");

        System.out.println("Your appliances:");
        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i]);
        }
        System.out.println();

        appliances[0].turnOn();
        appliances[3].turnOn();

        System.out.println("You have turned on the kettle and the washer.");
        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i]);
        }
    }
}
