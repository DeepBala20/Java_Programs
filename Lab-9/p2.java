/*Create interface EventListener with performEvent() method. Create MouseListener interface which inherits 
EventListener along with mouseClicked(), mousePressed(),
mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener interface which inherits 
EventListener along with keyPressed(), keyReleased()
methods. WAP to create EventDemo class which implements MouseListener and KeyListener and demonstrate
 all the methods of the interfaces. */

// p2 = 'EventDemo'//

interface EventListener{
    public void performEvent();
}

interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}

interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();
}

public class p2{
    static class Mouse implements MouseListener{
        public void performEvent(){
            System.out.println("Now Event Performing Is Start:-\n");
        }
        public void mouseClicked(){
            System.out.println("Mouse is Clicked.\n");
        }
        public void mousePressed(){
            System.out.println("Mouse is Pressed.\n");
        }
        public void mouseReleased(){
            System.out.println("Mouse is Released.\n");
        }    
        public void mouseMoved(){
            System.out.println("Mouse is Moved.\n");
        }
        public void mouseDragged(){
            System.out.println("Mouse is Dragged.\n");
        }
    }

    static class Key implements KeyListener{
        public void performEvent(){
            System.out.println("Now Event Performing Is Start:- \n");
        }
        public void keyPressed(){
            System.out.println("Key is Pressed.");
        }
        public void keyReleased(){
            System.out.println("Key is Released.");
        }
    }

    public static void main(String[] args){
        System.out.println("Mouse Operators:-");
        Mouse o1=new Mouse();
        o1.performEvent();
        o1.mouseClicked();
        o1.mouseDragged();
        o1.mouseMoved();
        o1.mousePressed();
        o1.mouseReleased();
    
    System.out.println("Key Operators:-");
        Key o2=new Key();
        o2.performEvent();
        o2.keyPressed();
        o2.keyReleased();   
    }
}