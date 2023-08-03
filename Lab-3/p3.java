import java.util.*;
public class p3{
    public static void main(String[] args){
        int nc;
        double rs=0,totalamount;

        Scanner sc=new Scanner(System.in);
        nc=sc.nextInt();

        System.out.println("calls="+nc);

        if(nc<=100){
            rs=200;
        }
        else if(nc<=150){
            rs=200+((nc-100)*0.6);
        }
        else if(nc<=200){
            rs=200+(50*0.6)+((nc-150)*0.5);
        }
        else if(nc>200){
            rs=200+(50*0.6)+(50*0.5)+((nc-200)*0.4);
        }
        totalamount=rs;
        System.out.println("Total Amount of Calls="+totalamount);
    }
}