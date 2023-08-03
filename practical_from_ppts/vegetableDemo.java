 abstract class vegetable{
 	public String color;
 	public String name;
 }
 class potato extends vegetable{
 	public String toString(){
 		color="Skin color";
 		return"potato-->"+color;
 	}
 }
 class brinjal extends vegetable{
 	public String toString(){
 		color="purple color";
 		return"brinjal-->"+this.color;
 	}
 } 
 class tomato extends vegetable{
 	public String toString(){
 		color="red color";
 		return "tomato-->"+color;
 	}
 }
 public class vegetableDemo{
 	public static void main(String[] args) {
 		potato p=new potato();
 		brinjal b=new brinjal();
 		tomato t=new tomato();
 		System.out.println(p);
 		System.out.println(b);
 		System.out.println(t);
 	}
 }