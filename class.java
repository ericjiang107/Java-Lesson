// class methods are refered to as static methods because you do not need an instance to use them

// triangle class blueprint:
public class Triangle {
    // instance variables -- each variable has a value to it
    double base;
    double height;
    double sideLengthOne;
    double sideLengthTwo;
    double sideLengthThree;

    // creating a constructor:
    public Triangle(double base, double height, double sideLengthOne, double sideLengthTwo, double sideLengthThree) {
        this.base = base;
        this.height = height;
        this.sideLengthOne = sideLengthOne;
        this.sideLengthTwo = sideLengthTwo;
        this.sideLengthThree = sideLengthThree;
    }

    // function to find the area of the triangle:
    public double findArea() {
        return (this.base * this.height) / 2;
    }
}