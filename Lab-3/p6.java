import java.util.*;
public class p6 {
    public static void main(String[] args){
        int i=1,n,flag=0;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        for(i=2;i<n;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("given number is prime.");
        }
        else{
            System.out.println("given number is not-prime.");
        }
    }
}
