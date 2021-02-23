package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Пожалуйста, введите два числа (через пробел):");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            System.out.println("Некорректный ввод");
        } else {
            for (int i = num1 + 1; i < num2; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
