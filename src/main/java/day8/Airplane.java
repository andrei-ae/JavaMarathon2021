package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public double getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println(getInfoString());
    }

    @Override
    public String toString() {
        return getInfoString();
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane plane1, Airplane plane2) {
        int lengthDiff = plane1.length - plane2.length;

        if (lengthDiff > 0) {
            System.out.println("Первый самолет длиннее");
        } else if (lengthDiff < 0) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }

    private String getInfoString() {
        return "Изготовитель: " + this.producer + ", год выпуска: " + this.year
                + ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel;
    }
}
