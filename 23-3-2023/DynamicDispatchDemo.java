import java.util.Scanner;
public class DynamicDispatchDemo{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int temp;
    Game g = new Game();
    temp=sc.nextInt();
        sc.close();
    if(temp==2){
        g=new Cricket();
        g.type();
    }
    else if(temp==3){
        g=new Football();
        g.type();
    }
    else if(temp==4){
        g=new Chess();
        g.type();
    }
    else if(temp==5){
        g=new Badminton();
        g.type();
    }
    }
}

class Game{
    void type(){
        System.out.println("Indoor/Outdoor");
    }
}

class Cricket extends Game{
    void type(){
        System.out.println("Cricket is Outdoor Game.");
    }
}

class Football extends Game{
    void type(){
        System.out.println("FootBall is Outdoor Game");
    }
}

class Badminton extends Game{
    void type(){
        System.out.println("Badminton is Indoor Game");
    }
}

class Chess extends Game{
    void type(){
        System.out.println("Chess is Indoor Game");
    }
}