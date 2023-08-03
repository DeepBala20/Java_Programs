interface transport{
	public void deliver();
}
abstract class animal{
	String name;	
	public abstract void show_detail();
	public void display(){}
}
class tiger extends animal
{
	tiger()
	{
		name="tiger";
	}
	public void show_detail()
	{
		System.out.println("This is the " + name + " Object!");
	}
	public void display()
	{
		show_detail();
	}
}
class camel extends animal implements transport{
	camel()
	{
		name="camel";
	}
	public void show_detail()
	{
		System.out.println("This is the " + name + " Object!");
	}
	public void deliver()
	{
		System.out.println("This animal is harmless and can be used for transport!");
	}
	public void display()
	{
		show_detail();
		deliver();
	}
}
class deer extends animal{
	deer()
	{
		name="deer";
	}
	public void show_detail()
	{
		System.out.println("This is the " + name + " Object!");
	}
	public void display()
	{
		show_detail();
	}	
}
class donkey extends animal implements transport{
		donkey()
	{
		name="donkey";
	}
	public void show_detail()
	{
		System.out.println("This is the " + name + " Object!");
	}	
	public void deliver()
	{
		System.out.println("This animal is harmless and can be used for transport!");
	}
	public void display()
	{
		show_detail();
		deliver();
	}	
}
public class animalDemo{
	public static void main(String args[])
	{
		//added code..
		animal[] a1 = new animal[4];
		a1[0] = new tiger();
		a1[1] = new camel();
		a1[2] = new deer();
		a1[3] = new donkey();

		for(int i = 0; i < 4; i++){
			a1[i].display();
		}		
	}
}