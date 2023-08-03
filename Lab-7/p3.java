import java.util.Scanner;
class rectangle{
	double l;
	double b;
	static int count=0;

	rectangle(){
		l=0;
		b=0;
		count++;
	}
	rectangle(double l,double b){
		this.l=l;
		this.b=b;
		count++;
	}

	rectangle(rectangle r){
		l=r.l;
		b=r.b;
		count++;
	}

	void displayArea(){
		System.out.println("Area of Rectangle ="+(l*b));
	}

	static void displaycount(){
		System.out.println("Number Of Object = "+count);
	}
}

public class p3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double l,b;
		System.out.print("length=");
		l=sc.nextDouble();
		System.out.print("Width=");
		b=sc.nextDouble();

		rectangle r=new rectangle();
		rectangle r1=new rectangle(l,b);
		rectangle r2=new rectangle(r1);

		r.displayArea();
		r1.displayArea();
		r2.displayArea();
		
		rectangle.displaycount();	
	}
}