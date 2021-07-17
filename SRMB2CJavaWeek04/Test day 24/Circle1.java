public class Circle1 {
    private double radius = 1.0;
    private String colour = "red";

    public Circle1() {
        super();
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + colour + "\n");
    }

    public Circle1(double radius) {
        super();
        this.radius = radius;
        System.out.println("Radius of circle: " + radius);
    }

    public double getRadius() {
        double r = radius;
        return r;
    }

    public double getArea() {
        double area = 0;
        return (3.14 * radius * radius);
    }

    public static void main(String[] args) {
        Circle1 c = new Circle1();
        Circle1 c1 = new Circle1(2.0);
        c1.getRadius();
        double rad = c1.getArea();
        System.out.println("The Area of Circle: " + rad);
    }
}