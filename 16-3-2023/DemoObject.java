public class DemoObject{
    public static void main(String[] args){
        BollywoodMovie Kgf=new BollywoodMovie();
        Kgf.name="KGF";
        Kgf.duration=120;
        System.out.println(Kgf);
    }
}

class Movie{
    String name;
    int duration;
    public String toString(){
        return "Name of the Movie " + name +", and duration of the movie"+ duration;
    }
}

class BollywoodMovie extends Movie{}