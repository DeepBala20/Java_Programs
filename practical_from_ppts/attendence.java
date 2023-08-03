import java.util.*;
public class attendence{
    public static void main(String[] args){
        int a,b,i,n,cp=0,cab=0,j=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b=sc.nextInt();
        int c[]=new int[10000];

        System.out.println("Attendence:-");
        System.out.println("Enter 1 if present");
        System.out.println("Enter 0 if absent");

        for(i=a;i<=b;i++){
            System.out.println(i+"=");
            n=sc.nextInt();
            if(n==1){
                cp=cp+1;
            }
            else if(n==0){
                cab=cab+1;
                c[j]=i;
                j++;
            }
            else{
                System.out.println("given input is invalid");
                do{
                    System.out.println("please enter 1 or 0");
                    System.out.print(i+"=");
                    n=sc.nextInt();
                    if(n==1){
                        cp=cp+1;
                    }
                    else if(n==0){
                        cab=cab+1;
                        c[j]=i;
                        j++;    
                        }       
                }while(n>1 || n<0);
            }
        }
        System.out.println("total present="+cp);
        System.out.println("total absent="+cab);
        System.out.println("");
        System.out.print("Absent Numbers=");
            for(j=0;j<cab;j++){
                System.out.print(c[j]+",");
            }
        System.out.print("\b");
    }
}