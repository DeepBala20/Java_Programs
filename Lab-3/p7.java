import java.util.*;
public class p7 {
    public static void main(String[] args){
        int n,n1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        System.out.println("n="+n);
        
        System.out.print("reverse number=");
        
        while(n>0){
            n1=(n%10);
            n=n/10;
            System.out.print(n1);
        }
    }
}
