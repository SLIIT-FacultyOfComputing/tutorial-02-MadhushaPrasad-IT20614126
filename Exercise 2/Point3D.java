import java.lang.Math;

class Point3D{
    private double x;
    private double y;
    private double z;

    //Add a constructor to initialize the variables passed. 
    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Add a method called distance () to calculate the distance from origin to a point.
    public double distance(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}