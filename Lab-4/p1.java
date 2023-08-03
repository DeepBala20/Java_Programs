import java.util.*;
public class p1{
	public static double simple(double x,double y, double z){
		return (x*y*z)/100;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double p,n,r;
		double intrest;

		p=sc.nextDouble();
		r=sc.nextDouble();
		n=sc.nextDouble();
		intrest=simple(p,r,n);

		System.out.println("Simple Intrest="+intrest);
	}
}