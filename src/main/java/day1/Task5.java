package day1;

public class Task5 {
    public static void main(String[] args) {
        int stopYear = 2020;

        for (int year = 1980; year <= stopYear; year += 4) {
            System.out.printf("Олимпиада %s года\n", year);
        }
    }
}
