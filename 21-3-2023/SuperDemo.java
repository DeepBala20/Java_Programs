public class SuperDemo {
    public static void main(String[] args){
        B bobj=new B();
        bobj.printMe();
    }
}

class A{
    int temp=10;
}

class B extends A{
    int temp = 20;
    public void printMe(){
        int temp=30;
        System.out.println("Local = "+temp);
        System.out.println("Class = "+this.temp);
        System.out.println("Super="+super.temp);
    }
}
