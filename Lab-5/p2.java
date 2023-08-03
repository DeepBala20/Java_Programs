import java.util.*;
public class p2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j=0,sum=0,k=0;
        System.out.print("n=");
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];

        for(i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
            if(a[i]%3==0 || a[i]%5==0){
                b[j]=a[i];
                j++;
                k=j;
            }
        }
        System.out.println("");
        System.out.print("sum=");
        for(j=0;j<k;j++){
            sum=sum+b[j];
            System.out.print(b[j]+"+");
        }
        System.out.print("\b");
        System.out.println(" = "+sum);
    }
}