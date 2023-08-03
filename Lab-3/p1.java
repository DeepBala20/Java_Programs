import java.util.*;
public class p1{
	public static void main(String[] args){
		double a,b;
		double div=1;
		char operator;

		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		

		System.out.println("a="+a+" b="+b);

		operator=sc.next().charAt(0);

		switch(operator){
			case '+': System.out.println(a+b);break;
			case '-': System.out.println(a-b);break;
			case '*': System.out.println(a*b);break;
			case '/': div=(a/b);System.out.println((double)(a/b));break;
		}
	}
}