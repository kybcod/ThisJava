package Check07.ex07;

public class Parent {
    public String nation;

    public Parent(){
        this("대한민국"); //3,
        System.out.println("Parent() call");//출력2
    }

    public Parent(String nation){
        this.nation = nation; //4
        System.out.println("Parent(String nation) call"); //출력1
    }
}
