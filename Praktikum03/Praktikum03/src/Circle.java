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
}

/*
Modifier: public, protected, private, default
* */