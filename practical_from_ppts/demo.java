import java.util.Scanner;
public class demo{
	public static void main(String[] args){
		demo1 o1=new demo();
		o1.check();
	}
}

class demo1{
		int i=0;
		Scanner sc= new Scanner(System.in);
		int[] A=new int[10];

		for(i=0;i<10;i++){
			A[i]=sc.nextInt();
			System.out.print("A["+(i+1)+"]="+A[i]);
		}
		

		public void check(){
			for(int i=0;i<8;i++){
				if(A[i] == A[(i+1)] && A[(i+1)] == A[(i+2)]){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}	
		}	
}