package Check17.ex06;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 25));

//        double avg = list.stream()
//                .mapToInt(s -> s.getAge())
//                .average()
//                .orElse(0);
//        System.out.println("평균 = " + avg);


        list.stream()
                .mapToInt(s->s.getAge())
                .average()
                .ifPresentOrElse(a-> System.out.println("평균 = "+a), ()-> System.out.println("값 없음"));


    }
}


class Member{
    private  String  name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}