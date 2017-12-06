package edu.msud.cs.cs1;

public class Rectangle extends Parallelogram {

    public Rectangle(double x, double y, double side1, double side2, double theta){

        super(x, y, side1, side2, theta);
    }



    @Override
    public String toString() {
        return String.format("Rectangle: x=%f y=%f side1=%f side2=%f theta=%f", x, y, side1, side2, theta);
    }
}
