import java.util.Scanner;
public class power{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;

		System.out.print("Enter a base =");
		a=sc.nextInt();
		System.out.print("Enter a power =");
		b=sc.nextInt();
		int ans=0;
		int n=a;

		for(int i=1;i<=b;i++){
			ans=0;
			for(int j=1;j<=a;j++){
				ans+=n;
			}

			n=ans;
		}
		System.out.println(n);
	}
}

//(5*5)*5
// (5 5 5 5 5)+(5 5 5 5 5)+(5 5 5 5 5)

//2*2*2*2
//