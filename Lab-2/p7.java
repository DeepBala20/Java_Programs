import java.util.*;
public class p7 {
    public static void main(String[] args){
        int s[] = new int[5],totalmark;
        double percentage;

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<5;i++){
            s[i]=sc.nextInt();
            System.out.println("s"+(i+1)+"="+s[i]);
        }
        totalmark=(s[0]+s[1]+s[2]+s[3]+s[4]);
        percentage=((totalmark/5));

        System.out.println("Total Marks="+totalmark);
        System.out.println("Percentage="+percentage);

        if(percentage<35){
            System.out.println("class = Fail.");
        }
        else if(percentage>=35 && percentage<45){
            System.out.println("class = Pass.");
        }
        else if(percentage>=45 && percentage<60){
            System.out.println("class = Second Class.");
        }
        else if(percentage>=60 && percentage<=70){
            System.out.println("class = First Class.");
        }
        else if(percentage>70){
            System.out.println("class = Distinct Class.");
        }
    }
}
