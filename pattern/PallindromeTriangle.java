import java.util.Scanner;

public class PallindromeTriangle {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x+2;
        int a = 2,p=0;
        for(int i = 1 ; i<=(n-2);i++){
           for(int j =1;j<n-a;j++){
            System.out.print(" ");
            
           }
           
           for(int k=1;k<i+a-1;k++){
            for(p=i;p>0;p--){
                System.out.print(p);
            }
            for(int q=2;q<(a-2);q++){
                System.out.print(q);
            }
           }
           a++;
            System.out.println();
        }
    }
}
