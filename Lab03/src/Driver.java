/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2/2/19
 */
public class Driver {

    public static void main(String[] args) {
        System.out.println("Creating Geometric Objects...");
        OrderedPair o1 = new OrderedPair(3, 2);
        OrderedPair o2 = new OrderedPair(4,5);
        OrderedPair o3 = new OrderedPair(3, 2);

        Shape r1 = new Rectangle(new OrderedPair(-6, 10), 4, 8);
        Shape r2 = new Rectangle(new OrderedPair(-7, -3), 1, 4);
        Shape r3 = new Rectangle(new OrderedPair(-6, 10), 4, 8);

        Shape c1 = new Circle(new OrderedPair(-10, 10), 10);
        Shape c2 = new Circle(new OrderedPair(-5, 3), 3);
        Shape c3 = new Circle(new OrderedPair(-10, 10), 10);

        testProject1(o1, o2, o3);

        testShapes(r1, r2, r3, 'r', 3);
        testShapes(c1, c2, c3, 'c', 4);

        // INSERT EXTRA CREDIT HERE

    }

    private static void testShapes(Shape r1, Shape r2, Shape r3, char prefex, int proj) {
        double dR1ToR2 = r1.distance(r2);
        double dR2ToR1 = r2.distance(r1);
        double dR1ToR3 = r1.distance(r3);

        printStars();
        System.out.println("PROJECT " + proj);
        printStars();
        System.out.println(prefex + "1: " + r1);
        System.out.println(prefex + "2: " + r2);
        System.out.println(prefex + "3: " + r3);
        System.out.println();
        System.out.println(prefex + "1 Area: " + r1.area());
        System.out.println(prefex + "2 Area: " + r2.area());
        System.out.println(prefex + "3 Area: " + r3.area());
        System.out.println();
        System.out.println(prefex + "1 Perimeter: " + r1.perimeter());
        System.out.println(prefex + "2 Perimeter: " + r2.perimeter());
        System.out.println(prefex + "3 Perimeter: " + r3.perimeter());
        System.out.println();
        System.out.println("Distance from " + prefex + "1 to " + prefex + "2: " + dR1ToR2);
        System.out.println("Distance from " + prefex + "2 to " + prefex + "1: " + dR2ToR1);
        System.out.println("Above distances equal?: " + (Double.compare(dR1ToR2, dR2ToR1) == 0));
        System.out.println("Distance from " + prefex + "1 to " + prefex + "3: " + dR1ToR3);
        System.out.println();
        System.out.println("Angle between " + prefex + "1 and " + prefex + "2: " + r1.angleBetween(r2));
        System.out.println("Angle between " + prefex + "2 and " + prefex + "3: " + r1.angleBetween(r2));
        System.out.println();
        System.out.println(prefex + "1.equals(" + prefex + "2): " + r1.equals(r2));
        System.out.println(prefex + "1.equals(" + prefex + "3): " + r1.equals(r3));
        System.out.println(prefex + "2.equals(" + prefex + "1): " + r2.equals(r1));
        System.out.println(prefex + "2.equals(" + prefex + "3): " + r2.equals(r3));
        System.out.println(prefex + "3.equals(" + prefex + "1): " + r3.equals(r1));
        System.out.println(prefex + "3.equals(" + prefex + "2): " + r3.equals(r2));
    }

    private static void testProject1(OrderedPair o1, OrderedPair o2, OrderedPair o3) {
        double distanceO1ToO2 = o1.distance(o2);
        double distanceO2ToO1 = o2.distance(o1);

        double distanceO1toO3 = o1.distance(o3);


        double thetaO1ToO2 = o1.angleBetween(o2);
        double thetaO2ToO1 = o2.angleBetween(o1);

        printStars();
        System.out.println("PROJECT 1");
        printStars();

        System.out.println("o1: " + o1);
        System.out.println("o2: " + o2);
        System.out.println("o3: " + o3);
        System.out.println();
        System.out.println("Distance from o1 to o2: " + distanceO1ToO2);
        System.out.println("Distance from o2 to o1: " + distanceO1ToO2);
        System.out.println("Above distances equal?: " + (Double.compare(distanceO1ToO2, distanceO2ToO1) == 0));
        System.out.println("Distance from o1 to o3: " + distanceO1toO3);
        System.out.println();
        System.out.println("Angle between o1 and o2: " + thetaO1ToO2);
        System.out.println("Angle between o2 and o1: " + thetaO2ToO1);
        System.out.println();
        System.out.println("o1.equals(o2): " + o1.equals(o2));
        System.out.println("o1.equals(o3): " + o1.equals(o3));
        System.out.println("o2.equals(o1): " + o2.equals(o1));
        System.out.println("o2.equals(o3): " + o2.equals(o3));
        System.out.println("o3.equals(o1): " + o3.equals(o1));
        System.out.println("o3.equals(o2): " + o3.equals(o2));
    }


    private static void printStars() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
