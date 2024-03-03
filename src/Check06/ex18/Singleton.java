package Check06.ex18;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public  static Singleton getInstance(){
        return singleton;
    }
}
