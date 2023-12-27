package Lab15;

import java.io.File;
import java.util.Scanner;

public class Lab15 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введіть ім'я каталогу для видалення файлів.");
            return;
        }

        String directoryName = args[0];
        File directory = new File(directoryName);

        if (!directory.isDirectory()) {
            System.out.println("Каталогу не існує.");
            return;
        }

        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Каталог порожній.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Увага! Видалити " + files.length + " файлів у каталозі " + directoryName + "? (Y/N)");
        String confirmation = scanner.next();

        if (confirmation.equalsIgnoreCase("Y")) {
            deleteFiles(files);
        } else {
            System.out.println("Операція видалення скасована.");
        }
        scanner.close();
    }

    private static void deleteFiles(File[] files) {
        for (File file : files) {
            if (file.delete()) {
                System.out.println("Файл " + file.getName() + " видалено.");
            } else {
                System.out.println("Помилка видалення файлу " + file.getName());
            }
        }
    }
}
