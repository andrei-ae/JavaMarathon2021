package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("src/main/resources/shoes.csv");
        File outputFile = new File("src/main/resources/missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(inputFile);
            String line;

            PrintWriter writer = new PrintWriter(outputFile);

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] lineData = line.split(";");

                if (lineData[2].equals("0")) {
                    line = String.join(", ", lineData);
                    writer.println(line);
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
