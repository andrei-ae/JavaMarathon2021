package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("МИГ", 2020, 5, 2135);

        plane.setYear(2021);
        plane.setLength(7);
        plane.fillUp(140);
        plane.fillUp(5);

        plane.info();
    }
}
