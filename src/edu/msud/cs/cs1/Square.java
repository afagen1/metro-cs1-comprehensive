package edu.msud.cs.cs1;

public class Square extends Rectangle {

    public Square(double x, double y, double side1, double theta){
        super(x, y, side1, side1, theta);
    }




    @Override
    public String toString() {
        return String.format("Square: x=%f y=%f side=%f theta=%f", x, y, side1, theta);
    }
}
