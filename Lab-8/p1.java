import java.util.Scanner;
public class p1{
    public static void main(String[] args){
        A a=new A();z
        B b=new B();
        C c=new C();
        D d=new D();

        System.out.println("run Class A = ");
        a.type();System.out.println("");
        
        System.out.println("run Class B =");
        b.type();System.out.println("");
        b.simple();System.out.println("");

        System.out.println("run Class C =");
        c.type();System.out.println("");
        c.simple();System.out.println("");
        c.multy();System.out.println("");

        System.out.println("run Class D =");
        d.type();
        d.hierarchical();
    }
}

class A{

    void type(){
        System.out.println("Super class.");
    }
}

class B extends A{
    void simple()
    {
        System.out.println("Simple Inheritance.");
    }
}

class C extends B{
    void multy(){
        System.out.println("multilevel Inheritance.");
    }
}

class D extends A{
    void hierarchical(){
        System.out.println("Hierarchical Inheritance.");
    }
}