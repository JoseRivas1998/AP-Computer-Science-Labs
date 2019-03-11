/**
 * @author [YOUR NAME HERE]
 * @version [DATE]
 */
public class OrderedPair {

    private double x;
    private double y;

    public OrderedPair() {
        this(0, 0);
    }

    public OrderedPair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double angleBetween(OrderedPair other) {
        // TODO 1.1
        // Use trigonometry to find the angle of the line between this point and the given point
        // THIS IS A STUB
        return 0;
    }

    public double distance(OrderedPair other) {
        // TODO 1.2
        // Use the euclidean distance
        // THIS IS A STUB
        return 0;
    }

    public OrderedPair copy() {
        // TODO 1.3
        // Return a new ordered pair with the same position
        // THIS IS STUB
        return null;
    }

    @Override
    public boolean equals(Object o) {
        // Here is the basic form for an equals method
        boolean result;
        if(o == null || o.getClass() != this.getClass()) {
            result = false;
        } else {
            OrderedPair other = (OrderedPair) o;
            result = (Double.compare(this.x, other.x) == 0) && (Double.compare(this.y, other.y) == 0);
        }
        return result;
    }

    @Override
    public String toString() {
        // TODO 1.4
        // Use the following format: (x,y)
        // THIS IS A STUB
        return "";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
