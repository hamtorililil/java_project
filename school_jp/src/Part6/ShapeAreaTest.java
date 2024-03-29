package Part6;

class Shape4{
    public double getArea(){return 0;}
    public Shape4(){super();}
}
class Rectangle4 extends Shape4{
    private double width, height;
    public Rectangle4(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }
    public double getArea(){return width*height;}
}

class Triangle4 extends Shape4{
    private double base, height;
    public double getArea(){return 0.5*base*height;}
    public Triangle4(double base, double height){
        super ();
        this.base=base;
        this.height=height;
    }
}
public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape4 obj1 = new Rectangle4(10.0, 20.0);
        Shape4 obj2 = new Triangle4(10.0, 20.0);

        System.out.println("Rectangle: " + obj1.getArea());
        System.out.println("Triangle: " + obj2.getArea());
    }
}
