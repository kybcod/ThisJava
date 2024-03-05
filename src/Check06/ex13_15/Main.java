package Check06.ex13_15;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Member user1 = new Member("홍길동","hong");

        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if(result){
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        }
        else {
            System.out.println("id와 또는 password가 올바르지 않습니다.");
        }
    }
}