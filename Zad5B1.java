// Zad5B1

class Punkt2DD
{
    protected double x;
    protected double y;
    public Punkt2DD(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt2D{" + "x=" + x + ", y=" + y + '}';
    }
}

class Punkt3D extends Punkt2DD
{
    protected double z;
    public Punkt3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {return "Wspolzedne(x,y,z):"+x+" "+y+" "+z;}
}

public class Zad5B1 {
    public static void main(String[] args) {
        Punkt2DD p2d1 = new Punkt2DD(2,2);
        Punkt3D p3d1 = new Punkt3D(4,4,2);
        System.out.println(p2d1.toString());
        System.out.println(p3d1.toString());
        // Co jest wymagane ? no ogolnie to konstruktorki - parametryczne i jakby w punkt 2d x i y był private to też gettery by sie przydały no i fajnie jak są te toStringi()
    }
}
