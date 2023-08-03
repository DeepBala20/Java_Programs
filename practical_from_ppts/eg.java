import java.util.*;
public class eg {
    public static double fun(double x,String dim,double y ,String dim1){
        double X=1,Y;
        if((dim.equals("cm") && dim1.equals("km"))||(dim.equals("Cm") && dim1.equals("Km"))||(dim.equals("CM") && dim1.equals("KM"))){
            Y=y*1000*100;
            X=X*(x/Y);
        }
        else if((dim.equals("cm") && dim1.equals("dm"))||(dim.equals("Cm") && dim1.equals("Dm"))||(dim.equals("CM") && dim1.equals("DM"))){
            Y=y*10;
            X=X*(x/Y);
        }
        else if((dim.equals("cm") && dim1.equals("mm"))||(dim.equals("Cm") && dim1.equals("Mm"))||(dim.equals("CM") && dim1.equals("MM"))){
            Y=y*0.1;
            X=X*(x/Y);
        }
        return X;
    }
    public static double fun(double RF,double max,String dim2,String dim){
        double Scale=1,Max=1;
        if((dim2.equals("km") && dim.equals("cm"))||(dim2.equals("Km") && dim.equals("Cm"))||(dim2.equals("KM") && dim.equals("CM"))){
            Max=Max*max*1000*100;
            Scale=Scale*RF*Max;
        }
        else if((dim2.equals("dm") && dim.equals("cm"))||(dim2.equals("Dm") && dim.equals("Cm"))||(dim2.equals("DM") && dim.equals("CM"))){
            Max=Max*max*10;
            Scale=Scale*RF*Max;
        }
        else if((dim2.equals("mm") && dim.equals("cm"))||(dim2.equals("Mm") && dim.equals("Cm"))||(dim2.equals("MM") && dim.equals("CM"))){
            Max=Max*max*0.1;
            Scale=Scale*RF*Max;
        }
        return Scale;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x,y,RF,max,Length;
        String dim,dim1,dim2;
        
        System.out.println("x = Length of Drawing,"+"           "+"dim = Dimension of x");
        System.out.println("");
        System.out.println("y = Actual Length of Drawing"+"     "+"dim1 = Dimension of y");
        System.out.println("");
        System.out.println("max = Maximum Distance"+"           "+"dim2 = Dimension of max");
        System.out.println("");

        System.out.print("x=");
        x=sc.nextDouble();
        System.out.print("dimension=");
        dim=sc.next();
        System.out.print("y=");
        y=sc.nextDouble();
        System.out.print("dimension-1=");
        dim1=sc.next();
        System.out.print("max=");
        max=sc.nextDouble();
        System.out.print("dimension-2= ");
        dim2=sc.next();


        System.out.println("Length Of Drawing="+x+dim+"\n");
        System.out.println("Actual Length of Object="+y+dim1+"\n");
        System.out.println("Maximum Distance="+max+dim2+"\n");

        RF=fun(x,dim,y,dim1);
        System.out.println("Refractive Fraction="+RF+" "+dim+"\n");
        
        Length=fun(RF,max,dim2,dim);
        System.out.println("Length Of Scale="+Length+dim+"\n");
    }
}