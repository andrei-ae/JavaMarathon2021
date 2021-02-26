package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double numToDivide = scanner.nextDouble();
            double divideBy = scanner.nextDouble();

            if (divideBy == 0) {
                break;
            }

            System.out.println(numToDivide / divideBy);
        }
    }
}
