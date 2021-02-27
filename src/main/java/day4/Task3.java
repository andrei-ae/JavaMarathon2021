package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int rowsSize = 12;
        int columnsSize = 8;
        int maxValue = 50;
        Random rand = new Random();

        int[][] arr = new int[rowsSize][columnsSize];

        int maxRowIndex = 0;
        int maxRowSum = 0;
        int rowSum;

        for (int i = 0; i < rowsSize; i++) {
            for (int j = 0; j < columnsSize; j++) {
                arr[i][j] = rand.nextInt(maxValue + 1);
            }

            rowSum = Arrays.stream(arr[i]).sum();
            if (rowSum >= maxRowSum) {
                maxRowIndex = i;
                maxRowSum = rowSum;
            }
        }

        System.out.println(maxRowIndex);
    }
}
