interface EventListener{
	void PerformEvent();
}
interface MouseListener extends EventListener{
	void MouseClicked();
	void MouseDragged();
	void MouseMoved();
	void MouseReleased();
}
interface KeyListener extends EventListener{
	void KeyPressed();
}
class EventDemo implements MouseListener,KeyListener{
   public  void KeyPressed(){
	System.out.println("Perform Event");
   }
   public  void MouseClicked(){
	System.out.println("mouse clicked");

   }
   public  void MouseDragged(){
	System.out.println("Mouse Dragged");

   }
   public  void MouseMoved(){
	System.out.println("Mouse Moved");

   }
   public  void MouseReleased(){
	System.out.println("Mouse Released");

   } 
   public void PerformEvent(){
     System.out.println("Perform your event");
   }  
}
public class mouse{
	public static void main(String[] args) {
		EventDemo e=new EventDemo();
		EventDemo m=new EventDemo();
		EventDemo k=new EventDemo();
		k.KeyPressed();
		m.MouseReleased();
		m.MouseMoved();
		m.MouseClicked();
		m.MouseDragged();
		e.PerformEvent();
	}
}