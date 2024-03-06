package Check07.ex12;

public class Example {
    public static void action(A a){

        a.method1();

        /*
        A-method1()
        B-method1()
        C-method1()
        출력

        A,B,C 클래스가 A를 상속받기 때문에 method1() 모두 호출
        */

        if(a instanceof C c){
            c.method2(); // C-method2() 출력
        }

        //instanceof : 객체의 타입 확인, 객체가 특정 클래스의 인스턴스인지 확인
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C()); //매개 값이 C객체일 경우에만 method2()가 호출
    }
}

class A{
    public void method1(){
        System.out.println("A-method1()");
    }
}

class B extends A{
    public void method1(){
        System.out.println("B-method1()");
    }
}

class C extends A{
    public void method1(){
        System.out.println("C-method1()");
    }
    public void method2(){
        System.out.println("C-method2()");
    }
}

