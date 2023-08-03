import java.util.Scanner;

class Bank{
    int BankNo;
    String NameBank;
    String BranchName;
    String ifsccode;

    Bank(int BankNo,String NameBank,String BranchName,String ifsccode){
        this.BankNo=BankNo;
        this.NameBank=NameBank;
        this.BranchName=BranchName;
        this.ifsccode=ifsccode;
    }

    void accountDetails(){

    }
}

class Account extends Bank{
    long ActNo;
    double ActBalance;
    
    Account(int BankNo,String NameBank,String BranchName,String ifsccode,long ActNo,double ActBalance){
        super(BankNo,NameBank,BranchName,ifsccode);
        this.ActNo=ActNo;
        this.ActBalance=ActBalance;
    }

    void accountDetails(){
        System.out.println("Bank Number:"+BankNo);
        System.out.println("Name Of Bank:"+NameBank);
        System.out.println("Branch Name:"+BranchName);
        System.out.println("IFSC Code:"+ifsccode);
        System.out.println("Account Number:"+ActNo);
        System.out.println("Account Balance:"+ActBalance);
    }
}

public class p6{
    public static void main(String[] args){
        Scanner scNumber=new Scanner(System.in);
        Scanner scString=new Scanner(System.in);

        int bankno;
        long actno;
        double actbalance;
        String namebank,branchname,ifsccode;

        System.out.print("Bank Number:");
        bankno=scNumber.nextInt();
        System.out.print("Account Number:");
        actno=scNumber.nextInt();
        System.out.print("Account Balance:");
        actbalance=scNumber.nextDouble();
        System.out.print("Name Of Bank:");
        namebank=scString.nextLine();
        System.out.print("Branch Name:");
        branchname=scString.nextLine();
        System.out.print("IFSC Code:");
        ifsccode=scString.nextLine();
        System.out.println("");

        scNumber.close();
        scString.close();

        Bank A1=new Account(bankno,namebank,branchname,ifsccode,actno,actbalance);
        A1.accountDetails();
    }
}