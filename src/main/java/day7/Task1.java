package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("МИГ", 2020, 5, 2135);
        Airplane plane2 = new Airplane("ТУ", 2021, 34, 14500);

        Airplane.compareAirplanes(plane1, plane2);
    }
}