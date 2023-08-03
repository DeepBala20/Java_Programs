import java.util.Scanner;
class Shape{
    double pi=(22/7);
    double l,b,h,r;
    Scanner sc=new Scanner(System.in);
    double area;
    Shape(){
        System.out.println("Exicution Starts");
    }   
    Shape(double l,double b,double h,double r){
        this.l=l;
        this.b=b;
        this.h=h;
        this.r=r;
    }
    void displayArea(){}
}

class Circle extends Shape{
    Circle(){
        super();
    }
    void displayArea(){
        area= pi*Math.pow(r,2);
        System.out.println("Area of Circle ="+ area);
    }
}

class Triangle extends Shape{
    Triangle(){
        super();
    }
    void displayArea(){
        area= 0.5*b*h;
        System.out.println("Area of Triangle ="+ area);
    }
}

class Square extends Shape{
    Square(){
        super();
    }
    void displayArea(){
        area= Math.pow(l,2);
        System.out.println("Area of Square ="+ area);
    }
}

public class p2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double l,b,h,r;
        System.out.print("l = ");
        l=sc.nextDouble();
        System.out.print("b = ");
        b=sc.nextDouble();
        System.out.print("h = ");
        h=sc.nextDouble();
        System.out.print("r = ");
        r=sc.nextDouble();
        sc.close();

        Shape S1=new Circle();
        Shape S2=new Triangle();
        Shape S3=new Square();
        S1.displayArea();
        S2.displayArea();
        S3.displayArea();
    }
}