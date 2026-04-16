public class Circle {
    public static final double PI= 3.14159; // class field
    public double r; // instance field

    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }

    public double area() {
        return PI * r * r;
    }
    public double circumference() {
        return 2 * PI * r;
    }

    public void info() {
        System.out.println();
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
//        Circle c3 = new Circle();
        c1.r = 10;
        c2.r = 20;


        System.out.println(c1.r);
        System.out.println(c2.r);
        System.out.println(Circle.PI);
        System.out.println(c1.PI);
        System.out.println(c2.PI);
    }
}

/*
Modifier: public, protected, private, default
* */