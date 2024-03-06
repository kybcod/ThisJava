package Check07.ex07;

public class Child extends Parent {
    public String name;

    public Child(){
        this("홍길동"); //1, 자동기본 부모 생성자 호출 -> super()
        System.out.println("Child() call");//출력4
    }

    public Child(String name){
        super();
        this.name = name; //2, 기본 부모 생성자 호출 -> super() ,name = 홍길동
        System.out.println("Child(String name) call"); //출력3
    }
}
