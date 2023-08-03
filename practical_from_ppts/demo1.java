import java.util.Scanner;
public class demo1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int A[] = new int[10]; 
		for(int i=0;i<(A.length);i++){
			A[i]=sc.nextInt();
			System.out.println("A["+(i+1)+"]"+A[i]);
		}
		demo2 o1=new demo2();
		int c;
		c=o1.check(A[]);
	}
}

class demo2{
		int count=0;
	public int check(int A[]){
		for(int i=0;i<(A.length-1);i++){
			if(A[i]>A[(i+1)]){
				return 0;
			}
			if(A[i]==A[(i+1)]){
				count ++;
			}
			else{
				if(count<2){
					return 0;
				}
				count=0;
			}
		}
		if(count<2){
			return 0;
		}
	}
}