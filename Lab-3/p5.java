import java.util.*;
public class p5 {
    public static void main(String[] args){
        int i,n,facto=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();

        for(i=1;i<=n;i++){
            facto=(facto*i);
        }
        System.out.println("factorial of "+n+"=");
        System.out.println(facto);
    }
}
