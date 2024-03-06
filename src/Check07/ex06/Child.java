package Check07.ex06;

public class Child extends Parent{
    public int studentNo;

    public Child(String name, int studentNo){
//        this.name = name; //this는 자신의 클래스 안에서 있을 때 사용한다.
        super(name); //부모의 생성자 호출
        this.studentNo = studentNo;
    }
}
