class Outerclass{
    private int a=10;

    class Innerclass{
        int b=20;
        void printB(){
            System.out.println("From innerclass" + a);
        }
}

public class outerclassdemo{
    public static void main(String[] args){
        Outerclass oc=new Outerclass();
        Outerclass.Innerclass ic = oc.new Innerclass();
        ic.printB();
    }
}