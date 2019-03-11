package project2;

/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2019-01-18
 */
public abstract class Plant {

    private int age = 0;
    private int height = 0;

    public int getAge() {
        return this.age;
    }

    public void addYearToAge() {
        age++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    protected void printAgeAndHeight() {
        System.out.println("\tCurrent Age: " + getAge() + " " + "Current Height: " + getHeight());
    }

    public abstract void doSpring();

    public abstract void doSummer();

    public abstract void doFall();

    public abstract void doWinter();

}
