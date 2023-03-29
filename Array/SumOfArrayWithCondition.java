import java.util.Scanner;
public class SumOfArrayWithCondition{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many elements you wants in Array : ");
		int x = sc.nextInt();
		int n[] = new int[x];
		int i;

		for(i=0;i<10;i++){
			System.out.println("enter elements of Array : ");
			n[i] = sc.nextInt(); 
		}

		int sum=0;

		for(i=0;i<10;i++){
			if (n[i]%3==0 || n[i]%5==0){
				sum = sum + n[i];
			}
		}
		System.out.println("Sum of Derived Array is  : "+sum);	
	}
}