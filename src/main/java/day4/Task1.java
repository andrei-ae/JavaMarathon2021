package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int maxValue = 10;
        int nMoreThan8 = 0;
        int nEqual1 = 0;
        int nEven = 0;

        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand.nextInt(maxValue + 1);

            if (arr[i] > 8) {
                nMoreThan8++;
            }

            if (arr[i] == 1) {
                nEqual1++;
            }

            if (arr[i] % 2 == 0) {
                nEven++;
            }
        }

        System.out.println("Введено число " + arrLength + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + nMoreThan8);
        System.out.println("Количество чисел равных 1: " + nEqual1);
        System.out.println("Количество четных чисел: " + nEven);
        System.out.println("Количество нечетных чисел: " + (arrLength - nEven));
        System.out.println("Сумма всех элементов массива: " + Arrays.stream(arr).sum());
    }
}
