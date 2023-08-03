/*Create a class “Student” that would contain enrolment No, name, and gender and marks as instance variables and count as static variable which stores the count of the
objects; constructors and display(). Implement constructors to initialize instance variables.*/

public class p1{
	public static void main(String[] args){
		Student s1 = new Student(1,"krish","M",100);
		s1.display();
		Student s2 = new Student(2,"rutvik","M",90);
		s2.display();
		Student s3 = new Student(3,"abhi","M",80);
		s3.display();
	}
}

class Student{
		int Enr_No;
		String name;
		String gender;
		int marks;
		static int count=0;

		Student(int e,String n,String g,int m){
			Enr_No = e;
			name = n;
			gender = g;
			marks = m;
			count++;

		}
		public void display(){
			System.out.println(Enr_No+"\t"+name+"\t"+gender+"\t"+marks+"\t"+count);
		}
	}