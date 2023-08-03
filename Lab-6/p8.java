import java.util.*;
public class p8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r,i;
		r=sc.nextInt();
		i=sc.nextInt();

		Complex c1=new Complex(r,i);
		System.out.println("Complex-1 = "+c1.real+" + "+c1.imaginary+"i");
		r=sc.nextInt();
		i=sc.nextInt();
		Complex c2=new Complex(r,i);
		System.out.println("Complex-2 = "+c2.real+" + "+c2.imaginary+"i");
		Complex c3=new Complex();

		c3.add(c1,c2);
		System.out.println("Complex Number = "+c3.real+" + "+c3.imaginary+"i");
	}
}

class Complex{
	int real;
	int imaginary;

	Complex(){
		real=0;
		imaginary=0;
	}

	Complex(int rr,int ii){
		this.real=rr;
		this.imaginary=ii;
	}

	void add(Complex a,Complex b){
		this.real=a.real+b.real;
		this.imaginary=a.imaginary+b.imaginary;
	}
}