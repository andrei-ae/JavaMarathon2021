package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int arrLength = 100;
        int maxValue = 10000;
        int[] arr = new int[arrLength];
        Random rand = new Random();

        for (int i = 0; i < arrLength; i++) {
            arr[i] = rand.nextInt(maxValue + 1);
        }

        int startIndex = 0;
        int maxSum = arr[0] + arr[1] + arr[2];

        for (int i = 3; i < arrLength; i++) {
            int sum = arr[i - 2] + arr[i - 1] + arr[i];
            if (sum > maxSum) {
                maxSum = sum;
                startIndex = i - 2;
            }
        }

        System.out.println(maxSum);
        System.out.println(startIndex);
    }
}
