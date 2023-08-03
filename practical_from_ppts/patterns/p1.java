import java.util.*;
public class p1{
    public static void main(String[] args){
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Value of n");
        n=sc.nextInt();
        System.out.println("n="+n+"\n");

        for(i=1;i<(n*2);i++){
            for(j=1;j<(n*2);j++){
                if(i==1 || i==11 || j==1 || j==11){
                    System.out.print(6+" ");
                }
                else if(i==2 || i==10 || j==2 || j==10){
                    System.out.print(5+" ");
                }
                else if(i==3 || i==9 || j==3 || j==9){
                    System.out.print(4+" ");
                }
                else if(i==4 || i==8 || j==4 || j==8){
                    System.out.print(3+" ");
                }
                else if(i==5 || i==7 || j==5 || j==7){
                    System.out.print(2+" ");
                }
                else if(i==6 || i==6  || j==6){
                    System.out.print(1+" ");
                }
            }
            System.out.print("\n");
        }
    }
}