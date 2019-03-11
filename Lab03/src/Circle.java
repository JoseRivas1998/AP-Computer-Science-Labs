/**
 * @author [YOUR NAME HERE]
 * @version [DATE]
 */
public class Circle extends Shape {

    private double radius;

    public Circle(OrderedPair orderedPair, double radius) {
        super(orderedPair);
        // TODO 4.1
        // Set the radius to the given value
    }

    public Circle(double x, double y) {
        super(x, y);
        // TODO 4.2
        // Set the radius to a default value of 1
    }

    public Circle() {
        super();
        // TODO 4.3
        // Use the this keyword to set the position to the origin using this
    }

    @Override
    public double area() {
        // TODO 4.4
        // Return the area of the circle
        // THIS IS A STUB
        return 0;
    }

    @Override
    public double perimeter() {
        // TODO 4.5
        // Return the circumference of the circle
        // THIS IS A STUB
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        // TODO 4.6
        // Use the example in OrderedPair to return the correct value
        // THIS IS A STUB
        return false;
    }

    @Override
    public String toString() {
        // TODO 4.7
        // Use the following format: Circle at: (x,y) with radius: radius
        // THIS IS A STUB
        return "";
    }
}
