import java.util.*;
public class p3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        
        System.out.print("enter a value of n=");
        n=sc.nextInt();

        for(i=n;i>0;i--){
                if(i==n){
                    for(j=((n*2)-1);j>0;j--){
                        System.out.print("*");
                    }
                }
                else if(i==(n-1)){            
                    for(j=((n*2)-1);j>0;j--){
                        if(j==((n*2)-1) || j==1){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("*");
                        }
                    }
                }
                else if(i>0){
                    for(j=((n*2)-1);j>0;j--){
                        if(j==((n*2)-1) || j==2 || j==((n*2)-2) || j==1){
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("*");
                        }
                    }
                }
                else if(i==(n-3))
            System.out.print("\n");
        }
    }
}