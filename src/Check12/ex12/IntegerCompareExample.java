package Check12.ex12;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);
//        System.out.println(obj3 == obj4); //false
        //int값의 범위가 넘어가면 값을 비교할 때 '=='을 쓰면 false가 나옴
        //참조타입은 equals()를 사용하여 비교
        System.out.println(obj3.equals(obj4)); //true

    }
}
