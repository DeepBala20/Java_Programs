public class DemoOfInheritance{
    public static void main(String[] args){
        Car c=new Car();
        c.start();
    }
}

class vehicle{
    int noOfPassanger;
    vehicle(){
        System.out.println("key ended.");
    }
    void start(){
        System.out.println("Key Entered.");
        System.out.println("Started.");
    }
    void stop(){
        System.out.println("Stopped.");
    }
}

class Car extends vehicle{
    int noOfAirBags=5;
    void start(){
        System.out.println("airbags ="+noOfAirBags);
    }
}