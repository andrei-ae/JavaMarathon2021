package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nTimes = 5;
        double numToDivide;
        double divideBy;

        for (int i = 0; i < nTimes; i++) {
            numToDivide = scanner.nextDouble();
            divideBy = scanner.nextDouble();

            if (divideBy == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(numToDivide / divideBy);
        }
    }
}
