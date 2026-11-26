
/**
 * Point class represents a point in a two-dimensional space.
 * It contains x and y coordinates.
 */
class Point {

    // Attributes
    private int x;
    private int y;

    /**
     * Parameterized constructor.
     * Initializes the point with x and y coordinates.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Updates the x coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Updates the y coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Calculates the distance from the origin (0,0).
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Moves the point by dx and dy units.
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Returns the point in [x;y] format.
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }

    /**
     * Calculates the distance between this point and another point.
     */
    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Updates both x and y coordinates.
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Main method to test the Point class.
     */
    public static void main(String[] args) {

        // Create first point
        Point p1 = new Point(5, 3);

        // Test getters
        System.out.println("X coordinate: " + p1.getX());
        System.out.println("Y coordinate: " + p1.getY());

        // Test distance from origin
        System.out.println("Distance from origin: "
                + p1.distanceFromOrigin());

        // Test translate
        p1.translate(2, 1);
        System.out.println("After translation: " + p1);

        // Test setters
        p1.setX(10);
        p1.setY(8);
        System.out.println("After setters: " + p1);

        // Create second point
        Point p2 = new Point(3, 4);

        // Test distance between two points
        System.out.println("Second point: " + p2);
        System.out.println("Distance between points: "
                + p1.distance(p2));

        // Test setLocation
        p1.setLocation(6, 8);
        System.out.println("After setLocation: " + p1);

        // Test distance from origin again
        System.out.println("New distance from origin: "
                + p1.distanceFromOrigin());
    }
}
