import java.util.Scanner;
public class Bmi{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in pounds :");
		float w = sc.nextFloat();
		System.out.println("Enter Height in inches :");
		float h = sc.nextFloat();

		double bmi = (w*0.45359237)/((h*0.0254)*(h*0.0254));

		System.out.println("Your Bmi is = "+bmi);
		

	}
}