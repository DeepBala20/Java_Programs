/*Create a class named Bank_Account with Account_No, User_Name, Email, Account_Type and Account_Balance data members. Also create a method GetAccountDetails()
and DisplayAccountDetails(). Create main method to demonstrate the Bank_Account class.*/
import java.util.*;
public class p2{
	public static void main(String[] args){
		Bank_Account s1 = new Bank_Account();
		s1.GetAccountDetails();
		Bank_Account s2 = new Bank_Account();
		s2.GetAccountDetails();
		
		s1.DisplayAccountDetails();
		s2.DisplayAccountDetails();
	}
}

class Bank_Account{
	int Account_No;
	String User_Name;
	String Email;
	String Account_Type;
	double Account_Balance;

	public void GetAccountDetails(){
		Scanner sc=new Scanner(System.in);
		Account_No=sc.nextInt();
		sc.nextLine();
		User_Name=sc.nextLine();
		Email=sc.nextLine();
		Account_Type=sc.nextLine();
		Account_Balance=sc.nextDouble();
		System.out.print("\n");
	}

	public void DisplayAccountDetails(){
		System.out.println(Candidate_ID+"\t"+Candidate_Name+"\t"+Candidate_Age+"\t"+Candidate_Weight+"\t"+Candidate_Height+".");
	}
}