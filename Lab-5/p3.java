import java.util.*;
public class p3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,f,ans=0;
        System.out.print("n=");
        n=sc.nextInt();
        int a[]=new int[n];

        for(i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
        }

        System.out.println("Enter A Finding Number=");
        f=sc.nextInt();
        
        for(i=0;i<n;i++){
            if(a[i]==f){
                ans=(i);
            }
        }
        if(a[ans]==f){
            System.out.println(" Given Finding Number Index="+(ans)+".");
        }
        else{
            System.out.println("Given Finding Number is Invalid.");
        }
    }
}
