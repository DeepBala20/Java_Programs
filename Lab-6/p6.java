import java.util.*;
public class p6 {
    public static void main(String[] args){
        Circle r=new Circle();
        r.Area();
        r.Perimeter();
        r.Display();
    }
}

class Circle{
    double Pi=(3.14);
    double radius;
    double area;
    double perimeter;

    Circle(){
        Scanner sc=new Scanner(System.in);
            System.out.print("Radius=");
            radius=sc.nextDouble();
    }
    public void Area(){
        area = (Pi)*(Math.pow(radius,2));
    }

    public void Perimeter(){
        perimeter= 2*(Pi)*(radius);
    }

    public void Display(){
        System.out.println("Area of Cirlce="+area+",\n"+"Perimeter of Circle="+perimeter);
    }
}