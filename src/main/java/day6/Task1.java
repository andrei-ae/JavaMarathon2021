package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2019);
        car.setColor("пурпурный");
        car.setModel("Красавчик-1");

        Motorbike bike = new Motorbike("Кагувасэ-1", "зелёный", 2021);

        System.out.println("Разница между годами для автомобиля: " + car.yearDifference(2021));
        System.out.println("Разница между годами для мотоцикла: " + bike.yearDifference(2017));
    }
}
