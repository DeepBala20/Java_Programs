import java.util.*;
public class p5 {
    public static void main(String[] args){
        Student s1=new Student();
        s1.GetStudentDetails();
        s1.DisplayStudentDetails();
    }
}

class Student{
    int ENR_NO;
    String Name;
    int Sem;
    double CPI;
    double SPI;

    public void GetStudentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENR_NO=");
        ENR_NO=sc.nextInt();
        sc.nextLine();
        System.out.print("Student Name=");
        Name=sc.nextLine();
        System.out.print("Semester=");
        Sem=sc.nextInt();
        System.out.print("CPI=");
        CPI=sc.nextDouble();
        System.out.print("SPI=");
        SPI=sc.nextDouble();
    }

    public void DisplayStudentDetails(){
        System.out.println(ENR_NO+"\t"+Name+"\t"+Sem+"\t"+CPI+"\t"+SPI);
    }
}