package Check06.ex18;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){

    }//자동으로 생성되는 생성자를 접근하지 못하도록 private

    public  static Singleton getInstance(){
        return singleton;
    }
}
