import java.util.*;
public class p1{
    public static void main(String[] args){
        int a,b,c;
        double A,B,C;
        System.out.println("Enter Values in meter");
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        System.out.println("a="+a+"m b="+b+"m c="+c+"m");

        A = a*3.28;
        B = b*3.28;
        C = c*3.28;

        System.out.println("Convert Value in Feet:");
        
        System.out.println("A="+A+"ft B="+B+"ft C="+C+"ft");
    }
}