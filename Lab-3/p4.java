import java.util.*;
public class p4 {
    public static void main(String[] args){
        int a,b,i=1;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();

        for(i=(a+1);(i>a && i<b);i++){
            if((i%2)==0 && (i%3)!=0){
                System.out.print(i+",");
            }
        }
    }
}
