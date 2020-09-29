package by.tms.lesson12.trainingManual;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    /*
    Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
     */

    public static void main(String[] args) {
        File file = new File("/Users/trifonovanv/Desktop/TeachMeSkills/TMS_Homework");
        List<String> files = new ArrayList<>();
        List<String> catalogues = new ArrayList<>();

        File[] list = file.listFiles();
        for (File i : list) {
            if (i.isDirectory()) {
                catalogues.add(i.getName());
            } else {
                files.add(i.getName());
            }
        }

        System.out.println("Files: ");
        for (String i : files) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Catalogues: ");
        for (String i : catalogues) {
            System.out.println(i);
        }
    }
}
