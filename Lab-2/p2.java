import java.util.*;
public class p2 {
    public static void main(String[] args){
        System.out.println("Enter a weight in pound");
        Scanner sc=new Scanner(System.in);
        int a,b;
        double A,B,BMI;
        
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("weight="+a+"pound, height="+b+"inch");
        A=a*0.45359237;
        B=b*0.0254;
        System.out.println("Weight="+A+"Kg, Height="+B+"m");

        BMI=(A/(B*B));
        System.out.println("Body Mass Index="+BMI);
    }
}

