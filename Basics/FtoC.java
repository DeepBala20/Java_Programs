import java.util.Scanner;
public class FtoC{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Farenhit");
		float f = sc.nextFloat();
		float c = (f-32 )*(5/9);
		System.out.println("Calcious = "+ c);
	}
}