package Lesson_01.Ex003_01;

public class Program {

    public static void main(String[] args) {
        Point3D a = new Point3D(0, 4, 2);

        System.out.println(a.getX());
        System.out.println(a.getY());
        System.out.println(a.getZ());
        System.out.println(a);
        Point3D b = new Point3D(2,28,2);
        System.out.println(b.getX());
        System.out.println(b.getY());
        System.out.println(b.getZ());
        System.out.println(b);

        var dis = Point3D.distance(a, b);
        System.out.println(dis);
    }
}
