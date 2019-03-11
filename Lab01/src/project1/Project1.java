package project1;

/**
 * @author [YOUR NAME HERE]
 * @version [DATE HERE]
 */
public class Project1 {

    public static void main(String[] args) {
        printSeparators();
        System.out.println("TESTING sum(int, int)");
        printSeparators();
        System.out.println("sum(3, 2) = " + sum(3, 2));
        System.out.println("sum(2, 3) = " + sum(2, 3));
        System.out.println("sum(-3, -6) = " + sum(-3, -6));
        System.out.println("sum(7, 3) = " + sum(7, 3));
        System.out.println("sum(7, -3) = " + sum(7, -3));
        printSeparators();
        System.out.println("TESTING lessThanOrEqualToZero(int)");
        printSeparators();
        System.out.println("lessThanOrEqualToZero(5) = " + lessThanOrEqualToZero(5));
        System.out.println("lessThanOrEqualToZero(-2) = " + lessThanOrEqualToZero(-2));
        System.out.println("lessThanOrEqualToZero(0) = " + lessThanOrEqualToZero(0));
        System.out.println("lessThanOrEqualToZero(1) = " + lessThanOrEqualToZero(1));
        printSeparators();
        System.out.println("TESTING gradeLetter(int)");
        printSeparators();
        System.out.println("gradeLetter(100) = " + gradeLetter(100));
        System.out.println("gradeLetter(99) = " + gradeLetter(99));
        System.out.println("gradeLetter(76) = " + gradeLetter(76));
        System.out.println("gradeLetter(-10) = " + gradeLetter(-10));
        System.out.println("gradeLetter(60) = " + gradeLetter(60));
        System.out.println("gradeLetter(81) = " + gradeLetter(81));
        System.out.println("gradeLetter(110) = " + gradeLetter(110));
        System.out.println("gradeLetter(58) = " + gradeLetter(58));
        printSeparators();
        System.out.println("TESTING evenOrOdd(int)");
        printSeparators();
        System.out.println("evenOrOdd(3) = " + evenOrOdd(3));
        System.out.println("evenOrOdd(146) = " + evenOrOdd(146));
        System.out.println("evenOrOdd(9) = " + evenOrOdd(9));
        printSeparators();
        System.out.println("TESTING addUp(int)");
        printSeparators();
        System.out.println("addUp(4) = " + addUp(4));
        System.out.println("addUp(13) = " + addUp(13));
        System.out.println("addUp(600) = " + addUp(600));
        printSeparators();
        System.out.println("TESTING checkPassword(String, String)");
        printSeparators();
        System.out.println("checkPassword(\"MyPassWord123\", \"MyPassWord123\") = " + checkPassword("MyPassWord123", "MyPassWord123"));
        System.out.println("checkPassword(\"MyPassword123\", \"MyPassword123\") = " + checkPassword("MyPassWord123", "MyPassword123"));
        System.out.println("checkPassword(\"MyPassWord123\", \"pASSWOrdGuess\") = " + checkPassword("MyPassWord123", "pASSWOrdGuess"));
        printSeparators();
        System.out.println("TESTING checkUsername(String, String)");
        printSeparators();
        System.out.println("checkUsername(\"JohnDoe\", \"JohnDoe\") = " + checkUsername("JohnDoe", "JohnDoe"));
        System.out.println("checkUsername(\"JohnDoe\", \"johndoe\") = " + checkUsername("JohnDoe", "johndoe"));
        System.out.println("checkUsername(\"JohnDoe\", \"sarahJane\") = " + checkUsername("JohnDoe", "sarahJane"));
    }

    private static void printSeparators() {
        final int numStars = 40;
        final char separator = '=';
        for (int i = 0; i < numStars; i++) {
            System.out.print(separator);
        }
        System.out.println();
    }

    /**
     * Calculate and return the sum of the two given integers
     *
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a, int b) {
        // TODO
        // THIS IS A STUB
        return 0;
    }

    /**
     * Return true if a is less than or equal to zero
     *
     * @param a
     * @return
     */
    public static boolean lessThanOrEqualToZero(int a) {
        // TODO
        // THIS IS A STUB
        return false;
    }

    /**
     * Tell the letter grade of a given grade percentage using the following scale:
     * [90,inf) -> A
     * [80,89] -> B
     * [70,79] -> C
     * [60,69] -> D
     * [-inf,59] -> F
     *
     * @param grade
     * @return
     */
    public static char gradeLetter(int grade) {
        // TODO
        // THIS IS A STUB
        return 'A';
    }

    /**
     * Return a string telling whether the given number is even or odd
     *
     * @param a
     * @return
     */
    public static String evenOrOdd(int a) {
        // TODO
        // THIS IS A STUB
        return "";
    }

    /**
     * Return the sum of all the numbers leading up to and including a, for example,
     * if a = 4, then the sum = 1 + 2 + 3 + 4 = 10
     *
     * @param a
     * @return
     */
    public static int addUp(int a) {
        return 0;
    }

    /**
     * Return whether the given input matches the given password, case sensitive
     *
     * @param password
     * @param input
     * @return
     */
    public static boolean checkPassword(String password, String input) {
        // TODO
        // THIS IS A STUB
        return false;
    }

    /**
     * Return whether the given input matches the given username, not case sensitive
     *
     * @param username
     * @param input
     * @return
     */
    public static boolean checkUsername(String username, String input) {
        // TODO
        // THIS IS A STUB
        return false;
    }

}
