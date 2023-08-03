import java.util.*;
public class p2 {
    public static void main(String[] args){
        int i,j,n,min,min1,min2;
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        n=sc.nextInt();

        System.out.println("\n");

        for(i=1;i<(n*2);i++){
            for(j=1;j<(n*2);j++){
                min1 = (i<=j)? i:j;
                min2 = (((2*n)-i)<=((2*n)-j))? ((2*n)-i):((2*n)-j);
                min = (min1<=min2)? min1:min2;
                System.out.print((n-min+1)+" ");
            }
            System.out.print("\n");
        }

    }
}
