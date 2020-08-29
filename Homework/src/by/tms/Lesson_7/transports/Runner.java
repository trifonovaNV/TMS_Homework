package by.tms.Lesson_7.transports;

public class Runner {

    public static void main(String[] args) {
        Car mazda = new Car(170, 250, 2, "Mazda", 4, 11,
                "Sedan", 5);
        Truck maz = new Truck(420, 80, 14, "Maz", 6, 40, 19);
        CivilPlane airbus = new CivilPlane(45000, 890, 42, "Airbus", 34, 2000,
                300, true);
        MilitaryPlane raptor = new MilitaryPlane(11000, 2410, 20, "Boeing F-22 Raptor", 14,
                450, true, 480);

        Transport[] transports = {mazda, maz, airbus, raptor};
        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
        }
        System.out.println();

        mazda.countMaxParameters(2.5);
        maz.fillTruck(10);
        airbus.fillCivil(200);
        raptor.shot();
        raptor.bailout();
    }
}