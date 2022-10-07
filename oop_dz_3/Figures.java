package oop_dz_3;
//Продумать "иерархию" геометрических фигур в которой точно есть квадрат и прямоугольник
//организовать возможность вычисления площади этих фигур методом getArea()
abstract class Figure {
    private double sideA;
    private double sideB;

    public Figure(double a, double b){
        sideA = a; sideB = b;
    }
    public double getA (){return sideA;}
    public double getB (){return sideB;}

   abstract public double getArea ();
}
class Rectangle extends Figure {
    public Rectangle (double a, double b){
        super (a,b);
    }
    public double getArea (){
        return getA()*getB();
    }
}
class Square extends Rectangle{
    public Square (double a){
        super (a,a);
    }
}
class RightTriangle extends Figure {
    public RightTriangle (double a, double b){
        super (a,b);
    }
    public double getArea(){
        return getA()*getB()/2;
    }
}
class Circle extends Figure {
    public Circle (double Radius){
        super (Radius, Radius);
    }
    public double getArea(){
        return getA()*getA()*Math.PI;
    }
}
public class Figures {
    public static void main(String[] args) {
        Figure f = new Rectangle(5,10);
        System.out.println(f.getArea());
        f = new Square (5);
        System.out.println(f.getArea());
        f = new RightTriangle(5,10);
        System.out.println(f.getArea());
        f = new Circle (5);
        System.out.println(f.getArea());
    }
}
