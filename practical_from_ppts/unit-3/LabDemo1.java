import java.util.Scanner;

abstract class Vegetable{
    String Name;
    String Color;
    
    abstract public String toString();
}

class Potato extends Vegetable{
    public String toString(){
        Color="Skin";
        return "Potato-->"+Color;
    }
}

class Brinjal extends Vegetable{
    public String toString(){
        Color="purple";
        return "Brinjal-->"+Color;
    }
}

class Tomato extends Vegetable{
    public String toString(){
        Color="red";
        return "Tomato-->"+Color;
    }
}

public class LabDemo1{
    public static void main(String[] args){
        Vegetable V1=new Potato();
        Vegetable V2=new Brinjal();
        Vegetable V3=new Tomato();
        System.out.println(V1);
        System.out.println(V2);
        System.out.println(V3);
    }
}