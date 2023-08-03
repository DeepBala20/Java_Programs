public class ConstructorInheritance{
    public static void main(String[] args){
        B bobj=new B(10);
    }
}

class A{
    A(){
        System.out.println("Default A");
    }
    A(int a){
        this();
        System.out.println("perameterized A");
    }
}

class B extends A{
    B(){
        super(10);
        System.out.println("Default B");
    }
    B(int b){
        this();
        System.out.println("Parameterized B");
    }
}
