import java.util.*;
public class p3 {
    public static void main(String[] args){
        System.out.println("enter area of circle");
        double AREA;
        double r,daimeter;

        Scanner sc=new Scanner(System.in);
        AREA = sc.nextDouble();
        System.out.println("Area="+AREA);
        r= Math.sqrt((AREA/3.14));
        daimeter=r*2;
        
        System.out.println(r);
        System.out.println(daimeter);
    }
}
