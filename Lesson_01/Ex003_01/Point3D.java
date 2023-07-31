package Lesson_01.Ex003_01;


/** 
 * Это точка 2D
*/
public class Point3D {
    private int x, y; // Это координата х и у

    /**
     * Это конструктор ...
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point3D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point3D(int value) {
        this(value, value);
    }
    public Point3D() {
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    
    private String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point3D a, Point3D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    // ctor
    // get; set;
    // docs
    //
}
