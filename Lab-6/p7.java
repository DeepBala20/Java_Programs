import java.util.Scanner;
public class p7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h,m;
		h=sc.nextInt();
		m=sc.nextInt();
		Time t1=new Time(h,m);
		System.out.println("");
		System.out.println("Time 1="+t1.hh+":"+t1.mm);
		h=sc.nextInt();
		m=sc.nextInt();
		Time t2=new Time(h,m);
		Time t3=new Time();
		System.out.println("Time 2="+t2.hh+":"+t2.mm);

		t3.addTime(t1,t2);
		System.out.println("Time ="+t3.hh+":"+t3.mm);
	}
}

class Time{
	int hh;
	int mm;

	Time(){
		mm=0;
		hh=0;
	}

	Time(int hh,int mm){
		this.hh=hh;
		this.mm=mm;
	}

	void addTime(Time ta,Time tb){
		this.mm=ta.mm+tb.mm;
		this.hh=ta.hh+tb.hh;
		if(this.mm>=60){
			this.mm=this.mm-60;
			this.hh=ta.hh+tb.hh+1;
		}
	}
}