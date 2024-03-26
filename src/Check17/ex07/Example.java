package Check17.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동","개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권","개발자")
        );

        //개발자인 사람만 별도의 List 수집
        List<Member> developers = list.stream()
                .filter(s->s.getJob().equals("개발자"))
                .collect(Collectors.toList());

    //        .collect(() -> new ArrayList<Integer>(),
    //                (c, e) -> c.add(e),
    //                (a, b) -> a.addAll(b));

        developers.stream()
                .forEach(m-> System.out.println(m.getName()));
    }
}

class Member{
    private String name;
    private String job;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }
}