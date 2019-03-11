/**
 * @author [YOUR NAME HERE]
 * @version [DATE]
 */
public abstract class Shape {

    private OrderedPair pos;

    public Shape(OrderedPair orderedPair) {
        // TODO 2.1
        // Set pos to the given orderedPair, but NOT the same reference
    }

    public Shape(double x, double y) {
        // TODO 2.2
        // Set the pos to a new ordered pair using the given x and y
    }

    public Shape() {
        // TODO 2.3
        // The default position should be 0,0
    }

    public abstract double area();
    public abstract double perimeter();

    public double angleBetween(Shape shape) {
        return this.pos.angleBetween(shape.pos);
    }

    public double distance(Shape other) {
        // TODO 2.4
        // Return the euclidean distance between this shape's position and the given shape's position
        // NOTE: use the angle between method above for a hint
        // THIS IS A STUB
        return 0;
    }

}
