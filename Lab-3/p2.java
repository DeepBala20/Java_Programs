import java.util.*;
public class p2{
	public static void main(String[] args){
		double a,b,c;

		Scanner sc=new Scanner(System.in);

		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();

		System.out.println("a="+a+" b="+b+" c="+c);

		if(a==b && b==c){
			System.out.println("given triangle is equilateral.");
		}
		else if(a==b || a==c||b==c){
			System.out.println("given triangle is isolateral.");
		}
		else if((c*c)==((a*a)+(b*b)) || (b*b)== ((a*a)+(c*c)) || (a*a)== ((b*b)+(c*c))){
			System.out.println("given triangle is right-angle-triangle");
		}
		else{
			System.out.println("given triangle is scalen.");
		}
	}
}