package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        List<String> people = parseFileToStringList(file);

        System.out.println(people);
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            String line;
            String ageString;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();

                ageString = line.replaceAll("[^-\\d]", "");

                if (Integer.parseInt(ageString) < 0) {
                    throw new InputMismatchException("Некорректный входной файл");
                }

                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }

        return list;
    }
}
