package Check17.ex08;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자"));

        Map<String, List<Member>> map = list.stream()
                .collect(Collectors.groupingBy(Member::getJob));

        System.out.println("[개발자]");
        map.get("개발자").stream()
                        .forEach(System.out::println);

        System.out.println();

        System.out.println("[디자이너]");
        map.get("디자이너").stream()
                .forEach(System.out::println);
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

    @Override
    public String toString() {
        return "{name : " + name + ", job : " + job + "}";
    }
}