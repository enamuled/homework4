
/**
 * Line class represents a line between two points
 * in a two-dimensional space.
 */
public class task2 {

    // Attributes
    private Point p1;
    private Point p2;

    /**
     * Default constructor.
     * Creates a line from (0,0) to (0,0).
     */
    public task2() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
    }

    /**
     * Parameterized constructor.
     * Accepts two Point objects.
     */
    public task2(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Returns the starting point.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Returns the ending point.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Updates the starting point.
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Updates the ending point.
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Returns the line in string format.
     */
    @Override
    public String toString() {
        return "Line: " + p1 + " -> " + p2;
    }

    /**
     * Calculates and returns the length of the line.
     */
    public double length() {
        return p1.distance(p2);
    }

    /**
     * Main method to test the Line class.
     */
    public static void main(String[] args) {

        // Create two points
        Point point1 = new Point(2, 3);
        Point point2 = new Point(6, 6);

        // Create a line using parameterized constructor
        task2 line1 = new task2(point1, point2);

        // Display the line
        System.out.println(line1);

        // Calculate line length
        System.out.println("Line length: " + line1.length());

        // Test getters
        System.out.println("Starting point: " + line1.getP1());
        System.out.println("Ending point: " + line1.getP2());

        // Test setters
        line1.setP1(new Point(1, 1));
        line1.setP2(new Point(4, 5));

        System.out.println("After updating points:");
        System.out.println(line1);

        System.out.println("New line length: " + line1.length());

        // Test default constructor
        task2 line2 = new task2();
        System.out.println("Default line: " + line2);
        System.out.println("Default line length: " + line2.length());
    }
}
