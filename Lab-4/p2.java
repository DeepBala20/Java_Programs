import java.util.*;
public class p2{
	public static void max(int a,int b){
		if(a>b){
			System.out.println("a is max.");
		}
		else{
			System.out.println("b is max.");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,b;

		a=sc.nextInt();
		b=sc.nextInt();

		max(a,b);
	}
}