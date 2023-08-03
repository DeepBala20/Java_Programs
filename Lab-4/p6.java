import java.util.*;
public class p6 {
    public int gcd(int x,int y){
        int div=0;
        for(int i=1;i<=x && i<=y ;i++){
            if(x%i==0 && y%i==0){
                div=i;
            }
        }
        return div;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        p6 ans=new p6();
        c=ans.gcd(a,b);
        System.out.println("gcd of a & b ="+c);
    }
}
