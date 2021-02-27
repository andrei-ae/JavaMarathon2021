package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2021, "зелёный", "Кагувасэ-1");

        System.out.println("Модель: " + bike.getModel());
        System.out.println("Год выпуска: " + bike.getYearManufactured());
        System.out.println("Цвет: " + bike.getColor());
    }
}
