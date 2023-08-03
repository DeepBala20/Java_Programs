import java.util.*;
public class p1{
    public static void main(String[] args){
        int n,i,j,ce=0,co=0;
        System.out.print("N=");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                ce=ce+1;
            }
            else{
                co=co+1;
            }
        }
        System.out.println("");
        System.out.println("Number Of Even Numbers="+ce);
        System.out.println("Number Of Odd Numbers="+co);
    }
}