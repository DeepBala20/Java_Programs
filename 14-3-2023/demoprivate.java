import java.util.Scanner;
class BankAccount{
    private int balance= 12000;
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw=");

        int amountToWithDraw = sc.nextInt();
        if(amountToWithDraw<balance){
            balance = balance - amountToWithDraw;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void printBalance(){
        System.out.println("Current Balance="+balance);
    }
}

public class demoprivate{
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.printBalance();
        ba.withdraw();
        ba.printBalance();
    }
}