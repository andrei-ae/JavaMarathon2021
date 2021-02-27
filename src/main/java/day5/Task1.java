package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYearManufactured(2019);
        car.setColor("пурпурный");
        car.setModel("Красавчик-1");

        System.out.println("Модель: " + car.getModel());
        System.out.println("Год выпуска: " + car.getYearManufactured());
        System.out.println("Цвет: " + car.getColor());
    }
}
