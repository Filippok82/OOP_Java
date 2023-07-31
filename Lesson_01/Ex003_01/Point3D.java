package Lesson_01.Ex003_01;


/**
 * Это точка 2D
 */
public class Point3D {
    private int x, y, z; // Это координата х, y, z

    /**
     * Это конструктор ...
     *
     * @param valueX это координата Х
     * @param valueY это координата Y
     * @param valueZ это координата Z
     */
    public Point3D(int valueX, int valueY, int valueZ) {
        x = valueX;
        y = valueY;
        z = valueZ;
    }

    public Point3D(int value) {
        this(value, value, value);
    }

    public Point3D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() { return z; }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public void setZ(int value) { this.z = value; }


    private String getInfo() {
        return String.format("x: %d; y: %d; z: %d", x, y, z);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point3D a, Point3D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2) + Math.pow(a.z - b.z, 2));
    }

}
