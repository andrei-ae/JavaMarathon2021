package day1;

public class Task1 {
    public static void main(String[] args) {
        String word = "JAVA";
        int needCount = 10;

        while (needCount > 0) {
            System.out.print(word);

            if (needCount > 1) {
                System.out.print(" ");
            }

            needCount--;
        }
    }
}
