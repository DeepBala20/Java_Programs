import java.util.*;
public class p{
		public static int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int c=add(a,b);
		System.out.println(c);
	}
}
