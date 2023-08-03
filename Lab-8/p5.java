import java.util.Scanner;

class userinput{
    int a,b;
    final int c=0;

    userinput(int a,int b){
        this.a=a;
        this.b=b;
    }

    void addision(){
        try{
            c=a+b;
        }catch(Exception e){
            System.out.println("variable c has final value,therefore it can't change the value of c variable.");
        }
    }
}

public class p5{
    public static void main(String[] args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a=");
        a=sc.nextInt();
        System.out.print("Enter b=");
        b=sc.nextInt();

        userinput u1=new userinput(a,b);
        u1.addision();
    }
}