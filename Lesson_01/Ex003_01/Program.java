package Lesson_01.Ex003_01.;

public class Program {

    public static void main(String[] args) {
        Point3D a = new Point3D(0, 2);

        System.out.println(a.getX());
        // Point3D a = new Point3D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point3D b = new Point3D(0);
        System.out.println(b);
        // Point3D b = new Point3D(0, 10);

        var dis = Point3D.distance(a, b);
        System.out.println(dis);
    }
}
