class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}
class Square extends Rectangle
{
    double side;
    Square(double side)
    {
        super(side,side);

    }
    double getArea()
    {
        return side*side;
    }

    double getPerimeter()
    {
        return 4 * (side + side);
    }
}
class FindRectangleArea
{
    public static void main(String arg[])
    {
        Rectangle rect = new Rectangle(10, 5);
        Square sq=new Square(10);
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area of rectangle = " + rect.getArea());
        System.out.println("Perimeter of rectangle= " + rect.getPerimeter());
        System.out.println("Area of square= " + sq.getArea());
        System.out.println("Perimeter of square= " + sq.getPerimeter());

    }
}