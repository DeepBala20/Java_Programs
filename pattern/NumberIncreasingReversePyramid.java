import java.util.Scanner;

public class NumberIncreasingReversePyramid {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter N");
        int n= sc.nextInt();
        int i,j;
        for(i=n;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
