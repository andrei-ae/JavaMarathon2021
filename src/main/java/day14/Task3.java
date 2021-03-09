package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        List<Person> people = parseFileToObjList(file);
        System.out.println(people);
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            String line;
            String ageString;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] data = line.split(" ");

                int age = Integer.parseInt(data[1]);

                if (age < 0) {
                    throw new InputMismatchException("Некорректный входной файл");
                }

                Person person = new Person(data[0], age);
                list.add(person);
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
