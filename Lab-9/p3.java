/*The Transport interface declares a deliver () method. The abstract class Animal is the super class of the Tiger,
 Camel, Deer and Donkey classes. The Transport interface is
implemented by the Camel and Donkey classes. Write a test program that initialize an array of four Animal objects.
 If the object implements the Transport interface, the
deliver () method is invoked.*/

import java.util.Scanner;

interface Transport{
    public void deliver();
}

abstract class Animal{
    int AniID;
    String Color;

    Animal(){
    AniID=0;
    Color=null;
    }

    Animal(int AniID,String Color){
        this.AniID=AniID;
        this.Color=Color;
    }
    abstract void display();
    public void deliver(){
        
    }
}

class Tiger extends Animal{
    String Name="Tiger";

    Tiger(int AniID,String Color){
        super(AniID,Color);
    }
    public void display(){
        System.out.println("Name OF The Animal="+Name);
        System.out.println("Animal ID ="+AniID);
        System.out.println("Color OF Animal ="+Color);
    }
}

class Donkey extends Animal implements Transport{
    String Name="Donkey";

    Donkey(int AniID,String Color){
        super(AniID,Color);
    }
    public void display(){
        System.out.println("Name OF The Animal="+Name);
        System.out.println("Animal ID ="+AniID);
        System.out.println("Color OF Animal ="+Color);
    }
    public void deliver(){
        System.out.println("Due To Acciedent With Other Animal, Donkey is Delivered To Hospital.");
    }
}

class Camel extends Animal implements Transport{
    String Name="Camel";

    Camel(int AniID,String Color){
        super(AniID,Color);
    }
    public void display(){
        System.out.println("Name OF The Animal="+Name);
        System.out.println("Animal ID ="+AniID);
        System.out.println("Color OF Animal ="+Color);
    }
    public void deliver(){
        System.out.println("Due To Acciedent With Other Animal, Camel is Delivered To Hospital.");
    }
}

class Deer extends Animal{
    String Name="Deer";

    Deer(int AniID,String Color){
        super(AniID,Color);
    }
    public void display(){
        System.out.println("Name OF The Animal="+Name);
        System.out.println("Animal ID ="+AniID);
        System.out.println("Color OF Animal ="+Color);
    }
}

public class p3{
    public static void main(String[] args){
        int aniid[]=new int[4];
        String color[]=new String[4];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<4;i++){
            System.out.print("Animal Id:");
            aniid[i]=sc.nextInt();
            System.out.print("Color:");
            color[i]=sc.nextLine();
            sc.nextLine();
            System.out.print("");
        }
        Animal ani[]=new Animal[4];
            ani[0]=new Tiger(aniid[0],color[0]);
            ani[1]=new Camel(aniid[1],color[1]);
            ani[2]=new Donkey(aniid[2],color[2]);
            ani[3]=new Deer(aniid[3],color[3]);
        
        ani[0].display();System.out.print("\n");
        ani[1].display();System.out.print("\n");
        ani[2].display();System.out.print("\n");
        ani[3].display();System.out.print("\n");
        sc.close();

        for(int i=0;i<4;i++){
            boolean ans=ani[i] instanceof Transport;
            if(ans==true)
            {
                System.out.println("Obejct of Trasport is implemented.");
                ani[i].deliver();
            }
            else{
                System.out.println("Object of Transport is not implemented");
            }
        }
    }
}