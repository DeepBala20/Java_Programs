import java.util.*;
public class p3{
	public static void fibo(int x){
		int p=0,q=1;
		int c=p+q;
		System.out.println("Fibonacci Series is:");
		System.out.print(p+"\t");
		System.out.print(q+"\t");
		for(int i=3;i<=x;i++){
			c=q+p;
			System.out.print(c+"\t");
			p=q;
			q=c;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter a limit of fibonacci Series");
		x=sc.nextInt();
		fibo(x);
	}
}