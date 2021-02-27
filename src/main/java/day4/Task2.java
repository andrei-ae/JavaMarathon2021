package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arrLength = 100;
        int maxValue = 10000;

        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand.nextInt(maxValue + 1);
        }

        int minElem = arr[0];
        int maxElem = arr[0];
        int nElemsEnd0 = 0;
        int sumElemsEnd0 = 0;

        for (int elem : arr) {
            if (elem > maxElem) {
                maxElem = elem;
            }

            if (elem < minElem) {
                minElem = elem;
            }

            if (elem % 10 == 0) {
                nElemsEnd0++;
                sumElemsEnd0 += elem;
            }
        }

        System.out.println("Наибольший элемент массива: " + maxElem);
        System.out.println("Наименьший элемент массива: " + minElem);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + nElemsEnd0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumElemsEnd0);
    }
}
