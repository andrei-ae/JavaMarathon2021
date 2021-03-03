package day9.Task2;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public double area() {
        //hp: half perimeter
        double hp = (sideA + sideB + sideC) / 2d;
        return Math.sqrt(hp * (hp - sideA) * (hp - sideB) * (hp - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
