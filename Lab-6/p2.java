/*Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age, Candidate_Weight and Candidate_Height data members. Also create a method
GetCandidateDetails() and DisplayCandidateDetails(). Create main method to demonstrate the Candidate class*/
import java.util.*;
public class p2{
	public static void main(String[] args){
		Candidate s1 = new Candidate();
		s1.GetCandidateDetails();
		Candidate s2 = new Candidate();
		s2.GetCandidateDetails();
		
		s1.DisplayCandidateDetails();
		s2.DisplayCandidateDetails();
	}
}

class Candidate{
	int Candidate_ID;
	String Candidate_Name;
	int Candidate_Age;
	double Candidate_Weight;
	double Candidate_Height;

	public void GetCandidateDetails(){
		Scanner sc=new Scanner(System.in);
		Candidate_ID=sc.nextInt();
		sc.nextLine();
		Candidate_Name=sc.nextLine();
		Candidate_Age=sc.nextInt();
		Candidate_Weight=sc.nextDouble();
		Candidate_Height=sc.nextDouble();
		System.out.print("\n");
	}

	public void DisplayCandidateDetails(){
		System.out.println(Candidate_ID+"\t"+Candidate_Name+"\t"+Candidate_Age+"\t"+Candidate_Weight+"\t"+Candidate_Height+".");
	}
}