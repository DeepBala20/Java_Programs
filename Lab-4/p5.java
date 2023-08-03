import java.util.*;
public class p5 {
    public static double area(double r){
        double pai=3.14,circle=1;
        circle=(Math.pow(r,2)*pai);
        return circle;
    }
    public static int area(int x){
        int square=1;
        square= x*x;
        return square;
    }
    public static double area(double a,double b){
        double triangle=1;
        triangle=(0.5)*(a)*(b);
        return triangle;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,sa;
        double r,b,h,ca,ta;

        System.out.print("x=");
        x=sc.nextInt();
        System.out.print("r=");
        r=sc.nextDouble();
        System.out.print("b=");
        b=sc.nextDouble();
        System.out.print("h=");
        h=sc.nextDouble();

        sa=area(x);
        ca=area(r);
        ta=area(b,h);

        System.out.println("Area of The Square="+sa);
        System.out.println("Area of The Circle="+ca);
        System.out.println("Area of The Triangle="+ta);
    }
}