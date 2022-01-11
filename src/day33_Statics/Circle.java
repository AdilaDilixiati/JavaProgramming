package day33_Statics;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.1415926;

    public Circle(double radius, double pi){
        this.radius=radius;
        this.diameter=2*radius;
        this.pi=pi;
    }
     public double calcArea(){
        double Area = pi * (radius * radius);
        return Area;
     }

     public double Perimeter(){
         double Perimeter = 2*pi*radius;
         return Perimeter;
     }

     public static double printPi(){
        return pi;
     }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                "Area = " + calcArea() +
                "Perimeter = " + Perimeter() +
                '}';
    }
}

