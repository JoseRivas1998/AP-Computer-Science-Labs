/**
 * @author [YOUR NAME HERE]
 * @version [DATE]
 */
public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(OrderedPair orderedPair, double length, double width) {
        super(orderedPair);
        // TODO 3.1
        // Set the width and the length to appropriate values
    }

    public Rectangle(double x, double y) {
        // TODO 3.2
        // Use the this keyword to call the constructor above with default length and width of 1
    }

    public Rectangle() {
        // TODO 3.3
        // Use the this keyword to call the constructor above with a default position at the origin
    }

    @Override
    public double area() {
        // TODO 3.4
        // Return the area of the rectangle
        // THIS IS A STUB
        return 0;
    }

    @Override
    public double perimeter() {
        // TODO 3.5
        // Return the perimeter of the rectangle
        // THIS IS A STUB
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        // TODO 3.6
        // Use the example in OrderedPair to return the correct value
        // THIS IS A STUB
        return false;
    }

    @Override
    public String toString() {
        // TODO 3.7
        // Use the following format: Rectangle at: (x,y) with width and height: (width, height)
        // THIS IS A STUB
        return "";
    }
}
