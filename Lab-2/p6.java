import java.util.*;
public class p6 {
    public static void main(String[] args){
        int a,b,c;

        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        System.out.println("a="+a+", b="+b+", c="+c);

        if(a>=b){
            if(b>=c){
                System.out.println("a is larger.");
            }
            if(a>=c){
                System.out.println("a is larger.");
            }
        }

        if(b>=a){
            if(a>=c){
                System.out.println("b is larger.");
            }
            if(b>=c){
                System.out.println("b is larger.");
            }
        }

        if(c>=a){
            if(a>=b){
                System.out.println("c is larger.");
            }
            if(c>=b){
                System.out.println("c is larger.");
            }
        }
    }
}
