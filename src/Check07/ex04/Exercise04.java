package Check07.ex04;

public class Exercise04 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.method2();
    }
}

class Parent{
    public void method1(int a){

    }
    void method2(){

    }
}

class Child extends Parent {
    @Override //컴파일러가 컴파일 시 이 메소드가 재정의 한 것인지 체크
    public void method1(int a){

    }

    @Override
    public void method2(){

    }


}
