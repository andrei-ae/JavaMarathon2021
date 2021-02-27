package day5;

public class Motorbike {
    private int yearManufactured;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.yearManufactured = year;
        this.color = color;
        this.model = model;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
