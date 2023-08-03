import java.util.*;
public class o{
	public int add(int a,int b){
		return a+b;
	}
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		o t=new o();
		int c=t.add(a,b);

		System.out.println(c);
	}
}