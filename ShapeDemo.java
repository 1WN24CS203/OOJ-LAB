
import java.util.Scanner;

abstract class Shape {
    int dim1;
    int dim2;
    public abstract void printArea();
}
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        dim1 = length;
        dim2 = width;
    }
    public void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(int base, int height) {
        this.dim1 = base;
        this.dim2 = height;
    }
    public void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    public Circle(int radius) {
        this.dim1 = radius;
        this.dim2 = 0; 
    }
    public void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle");
        int l=in.nextInt();
        int b=in.nextInt();
        Rectangle r= new Rectangle(l, b);
        System.out.println("Enter base and height of triangle");
        int base=in.nextInt();
        int height=in.nextInt();
        Triangle t=new Triangle(base, height);
        System.out.println("Enter radius of circle");
        int radius=in.nextInt();
        Circle c =new Circle(radius);
        r.printArea();
        t.printArea();
        c.printArea();  
    }
}