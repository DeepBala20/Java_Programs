import java.util.*;
public class p5 {
    public static void main(String[] args){
        char aa;
        Scanner sc=new Scanner(System.in);
        
        aa=sc.nextLine().charAt(0);
        if(aa=='a' || aa=='e' || aa=='i' || aa=='o'|| aa=='u'){
            System.out.println("given character is vowel.");
        }
        else{
            System.out.println("given character is consonal.");
        }
        
    }
}
