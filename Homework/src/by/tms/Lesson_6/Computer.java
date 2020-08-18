package by.tms.Lesson_6;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String processor;
    private String operatingSystem;
    private String hardDisk;
    private int resourceOfWork;
    private boolean isBurnt;
    private boolean isWork;

    private final int maxResources = 4;

    public Computer(String processor, String operatingSystem, String hardDisk) {
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.hardDisk = hardDisk;
        resourceOfWork = 0;
        isBurnt = false;
        isWork = false;
    }

    public void printInformation() {
        System.out.println("Processor: " + processor + ", operating system: " + operatingSystem + ", hard disk: " +
                hardDisk + ", resources: " + resourceOfWork);
    }

    public boolean isGuessNumber(Scanner scanner) {
        Random random = new Random();
        int randomNumber = random.nextDouble() >= 0.5 ? 1 : 0;
//        System.out.println(randomNumber);

        System.out.print("Enter 0 or 1: ");
        int userChoice = scanner.nextInt();

        return userChoice == randomNumber;
    }

    public void turnOn(Scanner scanner) {
        if (!isBurnt && resourceOfWork <= maxResources) {
            if (!isWork) {
                if (isGuessNumber(scanner)) {
                    resourceOfWork++;
                    if (resourceOfWork > maxResources) {
                        System.out.println("You have exceeded the limit. It has burnt out.");
                        return;
                    }
                    System.out.println("You have turned on your computer.");
                    isWork = true;
                } else {
                    System.out.println("Your computer has burnt out.");
                    isBurnt = true;
                }
            } else {
                System.out.println("Sorry, you can't turn on your computer. It is on.");
            }
        } else {
            System.out.println("Sorry, you can't turn on your computer. It has burnt out.");
        }
    }

    public void turnOff(Scanner scanner) {
        if (!isBurnt && resourceOfWork <= maxResources) {
            if (isWork) {
                if (isGuessNumber(scanner)) {
                    resourceOfWork++;
                    if (resourceOfWork > maxResources) {
                        System.out.println("You have exceeded the limit. It has burnt out.");
                        return;
                    }
                    System.out.println("You have turned off your computer.");
                    isWork = false;
                } else {
                    System.out.println("Your computer has burnt out.");
                    isBurnt = true;
                }
            } else {
                System.out.println("Sorry, you can't turn off your computer. It is off.");
            }
        } else {
            System.out.println("Sorry, you can't turn off your computer. It has burnt out.");
        }
    }

    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("Enter: \n1. Turn on the computer; \n2. Turn off the computer; \n3. Show details; \n" +
                    "4. Finish work.");

            int choice = scanner.nextInt();
            while (choice < 1 || choice > 4) {
                System.out.println("Wrong number. Please, try again.");
                System.out.println("Enter: \n1. Turn on the computer; \n2. Turn off the computer; \n3. Show details; \n" +
                        "4. Finish work.");
                choice = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    this.turnOn(scanner);
                    break;
                case 2:
                    this.turnOff(scanner);
                    break;
                case 3:
                    this.printInformation();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i7", "macOS", "2.5 Seagate");
        Scanner scanner = new Scanner(System.in);
        computer.showMenu(scanner);
        scanner.close();
    }
}
