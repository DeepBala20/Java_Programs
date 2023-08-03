import java.util.*;
public class p4{
    public static int prime(int n){
        int flag=0,i=0;
        for(i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
            else{
                flag=1;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,ans;
        n=sc.nextInt();
        ans=prime(n);

        if(ans==1){
            System.out.println("given number is prime.");
        }
        else if(ans==0){
            System.out.println("given number is not-prime.");
        }
    }
}