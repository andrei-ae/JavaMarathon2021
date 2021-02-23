package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nFloors = scanner.nextInt();

        if (nFloors < 1) {
            System.out.println("Ошибка ввода");
        } else if (nFloors < 5) {
            System.out.println("Малоэтажный дом");
        } else if (nFloors < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
