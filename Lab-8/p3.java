import java.util.Scanner;

class Account_Details{
    int ActNo;
    String Cname;
    String Bname;
    double Balance;
    double POI;
    int year;

    Account_Details(){
        ActNo=0;
        Cname=null;
        Bname=null;
        Balance=0;
        POI=0;
        year=0;
    }

    Account_Details(int ActNo,String Cname,String Bname,double Balance,double POI,int year){
        this.ActNo=ActNo;
        this.Cname=Cname;
        this.Bname=Bname;
        this.Balance=Balance;
        this.POI=POI;
        this.year=year;
    }
}

class Interest extends Account_Details{
    double interest;
    Interest(int ActNo,String Cname,String Bname,double Balance,double POI,int year){    
        super(ActNo,Cname,Bname,Balance,POI,year);
        interest=((Balance*POI*year)/100);
    }
    void display(){
        System.out.println("Account No. :"+ActNo);
        System.out.println("Customer Name:"+Cname);
        System.out.println("Branch Name:"+Bname);
        System.out.println("Balance:"+Balance);
        System.out.println("Percentage Of Interest:"+POI);
        System.out.println("Interest Years:"+year+"\n");
        System.out.println("Total Interest:"+interest);
        System.out.println("Grand Total:"+(Balance+interest));       
    }
}

public class p3{
    public static void main(String[] args){
        Scanner scNumber=new Scanner(System.in);
        Scanner scString=new Scanner(System.in);
        
        int ActNo=scNumber.nextInt();
        String Cname=scString.nextLine();
        String Bname=scString.nextLine();
        double Balance=scNumber.nextDouble();
        double POI=scNumber.nextDouble();
        int Year=scNumber.nextInt();

        Interest c1=new Interest(ActNo,Cname,Bname,Balance,POI,Year);
        c1.display();
        scString.close();
        scNumber.close();
    }
}