import java.util.Scanner;

class Student{
    int StdId;
    String Name;
    int Sem;
    String div;
    double spi;

    Student(){
        StdId=00;
        Name=null;
        Sem=0;
        div=null;
        spi=0;
    }

    Student(int StdId,String Name,int Sem,String div,double spi){
        this.StdId=StdId;
        this.Name=Name;
        this.Sem=Sem;
        this.div=div;
        this.spi=spi;
    }
}

class Superdemo extends Student{
    String Branch;
    int NoSubject;
    Superdemo(int StdId,String Name,int Sem,String div,double spi,String Branch,int NoSubject){    
        super(StdId,Name,Sem,div,spi);
        this.Branch=Branch;
        this.NoSubject=NoSubject;
    }
    
    void display(){
        System.out.println("Student Id:"+StdId);
        System.out.println("Student Name:"+Name);
        System.out.println("Semester:"+Sem);
        System.out.println("Divison:"+div);
        System.out.println("Branch:"+Branch);
        System.out.println("Number Of Subjects:"+NoSubject);
        System.out.println("Spi:"+spi);
    }
}

public class p4{
    public static void main(String[] args){
        Scanner scString=new Scanner(System.in);
        Scanner scNumber=new Scanner(System.in);
        int stdid,sem,nosubject;
        double spi;
        String name,div,branch;

        System.out.print("Student id:");
        stdid=scNumber.nextInt();
        System.out.print("student name:");
        name=scString.nextLine();
        System.out.print("division:");
        div=scString.nextLine();
        System.out.print("semester:");
        sem=scNumber.nextInt();
        System.out.print("branch:");
        branch=scString.nextLine();
        System.out.print("number of subject:");
        nosubject=scNumber.nextInt();
        System.out.print("spi:");
        spi=scNumber.nextDouble();
        
        Superdemo s1=new Superdemo(stdid, name, sem, div, spi, branch, nosubject);
        s1.display();
        scNumber.close();
        scString.close();
    }
}