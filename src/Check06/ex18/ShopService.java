package Check06.ex18;

public class ShopService {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 ShopService 객체입니다.");
        }
        else {
            System.out.println("다른 ShopService 객체입니다.");
        }
     }
}
