package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    private static final int EXPECTED_NUM_COUNT = 10;

    public static void main(String[] args) {
        File file = new File("day14digits.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] stringNumbers = line.split(" ");

            if (stringNumbers.length != EXPECTED_NUM_COUNT) {
                throw new InputMismatchException("Некорректный входной файл");
            }

            for (String s : stringNumbers) {
                sum += Integer.parseInt(s);
            }

            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
