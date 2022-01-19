// Zad5A1

class Punkt2D
{
    protected double x;
    protected double y;
    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt2D{" + "x=" + x + ", y=" + y + '}';
    }
}

class Punkt2DKolor extends Punkt2D{
    private int R;
    private int G;
    private int B;
    public Punkt2DKolor(double x, double y, int r, int g, int b) {
        super(x, y);
        R = r;
        G = g;
        B = b;
    }

    @Override
    public String toString() {
        return "Wspolzedne(x,y):"+x+" "+y+"  Kolor:"+R+" "+G+" "+B;
    }
}

public class Zad5A1 {
    public static void main(String[] args) {
        Punkt2D p2d1 = new Punkt2D(2,2);
        Punkt2DKolor p2dk1 = new Punkt2DKolor(4,4,0,128,128);
        System.out.println(p2d1.toString());
        System.out.println(p2dk1.toString());
        // Co jest wymagane ? no ogolnie to konstruktorki - parametryczne i jakby w punkt 2d x i y był private to też gettery by sie przydały no i fajnie jak są te toStringi()
    }
}