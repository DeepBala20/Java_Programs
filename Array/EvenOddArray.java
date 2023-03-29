import java.util.Scanner;
public class EvenOddArray{
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

		int ce=0,co=0;
		for(i=0;i<10;i++){
			if (n[i]%2==0){
				ce++;
			}
			else{
				co++;
			}
		}
		System.out.println("number of Even element in array is : "+ce);
		System.out.println("number of Odd element in array is : "+co);	
	}
}