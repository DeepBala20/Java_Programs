import java.util.*;
public class p1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h,m;
		h=sc.nextInt();
		m=sc.nextInt();

		Time t1=new Time();
		t1.gettime(h,m);
		System.out.println(t1.hh+":"+t1.mm);
	}
}

class Time{
	static int hh,mm;

	void gettime(int h,int m){
		this.hh==h;
		this.mm==m;
	}
}