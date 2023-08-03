public class OverRiddingDemo{
    public static void main(String[] args){
        SmartPhone S=new SmartPhone();
        System.out.println("SmartPhone");
        S.setAlarm();

        Iphone i=new Iphone();
            System.out.println("Iphone");
            i.setAlarm();
    }
}

class SmartPhone{
    public void setAlarm(){
        System.out.println("Go to Apps \n Open Clock \n Set Alarm.");
    }
}

class Iphone extends SmartPhone{
    public void setAlarm(){
        System.out.println("Tell siri to Set Alarm");
    }
}
