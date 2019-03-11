/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 1/11/19
 */
public class Driver {

    public static void main(String[] args) {
        Averages averages = new Averages(90, 100, 43, 60, 54);
        System.out.println("Average: " + averages.average());
        System.out.println("Median: " + averages.median());
        System.out.println("Mode: " + averages.mode());

        averages.put(100);
        averages.put(45);
        averages.put(96);

        System.out.println("Average: " + averages.average());
        System.out.println("Median: " + averages.median());
        System.out.println("Mode: " + averages.mode());
    }

}
