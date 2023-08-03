import java.util.Scanner;

abstract class Vegetable{
    String Name;
    String Color;

    abstract public String toString();
}    


class Potato extends Vegetable{
    public String toString(){
        Color="Skin";
        return "Name of vegi.="+"Potato, "+"Color:"+Color;
    }
}

class Brinjal extends Vegetable{
    public String toString(){
        Color="Purple";
        return "Name of vegi.="+"Brinjal, "+"Color:"+Color;
    }
}

class Tomato extends Vegetable{
    public String toString(){
        Color="Red";
        return "Name of vegi.="+"Tomato, "+"Color:"+Color;
    }
}

public class p1{
    public static void main(String[] args){
        Vegetable V1=new Potato();
        Vegetable V2=new Brinjal();
        Vegetable V3=new Tomato();
        System.out.println(V1);
        System.out.println(V2);
        System.out.println(V3);
    }
}