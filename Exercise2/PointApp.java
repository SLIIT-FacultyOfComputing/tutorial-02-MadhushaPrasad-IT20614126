public class PointApp {
    public static void main(String[] args) {
        //create two objects of the class Point3D.
        Point3D p1 = new Point3D(3.5, 4.2,5.0);
        Point3D p2 = new Point3D(5.0, 6.1,1.2);

        //Calculate and display the distance to the origin of these objects.
        System.out.println("Distance to origin of p1 is " + p1.distance());
        System.out.println("Distance to origin of p2 is " + p2.distance());
    }
}