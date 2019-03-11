package project2;

/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2019-01-18
 */
public class MapleTree extends Plant {

    private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;

    private void grow() {
        int currentHeight = getHeight();
        setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
    }

    @Override
    public void doSpring() {
        grow();
        addYearToAge();
        System.out.println("Spring: the maple tree is starting to grow leaves and new branches");
        this.printAgeAndHeight();
    }

    @Override
    public void doSummer() {
        grow();
        System.out.println("Summer: The maple tree is continuing to grow.");
        this.printAgeAndHeight();
    }

    @Override
    public void doFall() {
        System.out.println("Fall: The maple tree has stopped growing and is losing its leaves.");
        this.printAgeAndHeight();
    }

    @Override
    public void doWinter() {
        System.out.println("Winter: The maple tree is dormant");
        this.printAgeAndHeight();
    }

}
