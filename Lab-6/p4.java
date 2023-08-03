/*Class Name: Employee
Data Members: Employee_ID, Employee_Name, Designation, Age, Salary
Member Functions: GetEmployeeDetails () and DisplayEmpolyeeDetails (). */

import java.util.*;
public class p4{
    public static void main(String[] args){
        Employee E1=new Employee();
        Employee E2=new Employee();
        E1.GetEmployeeDetails();
        E2.GetEmployeeDetails();

        E1.DisplayEmployeeDetails();
        E2.DisplayEmployeeDetails();
    }
}

class Employee{
    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    public void GetEmployeeDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Employe_ID=");
        Employee_ID=sc.nextInt();
        sc.nextLine();
        System.out.print("Employe_Name=");
        Employee_Name=sc.nextLine();
        System.out.print("Designation=");
        Designation=sc.nextLine();
        System.out.print("Age=");
        Age=sc.nextInt();
        System.out.print("Salary=");
        Salary=sc.nextDouble();
    }

    public void DisplayEmployeeDetails(){
        System.out.println(Employee_ID+"\t"+Employee_Name+"\t"+Designation+"\t"+Age+"\t"+Salary+".");
    }
}