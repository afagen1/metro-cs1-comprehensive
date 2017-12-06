package edu.msud.cs.cs1;

public class Parallelogram extends Geometric {

    protected double side1, side2, theta;

    public Parallelogram(double x, double y, double side1, double side2, double theta){
        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.theta = theta;
    }

    @Override
    public double getArea() {
        return Math.sin(theta) * side1 * side2;
    }

    @Override
    public String toString() {
        return String.format("Parallelogram: x=%f y=%f side1=%f side2=%f theta=%f", x, y, side1, side2, theta);
    }
}
