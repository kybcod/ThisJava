package Check15.ex09;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > maxScore){
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }


        System.out.println("평균 점수 : " + (double) totalScore/entrySet.size());
        System.out.println("최고 점수 : " + maxScore);
        System.out.println("최고 점수 받은 아이디 : " + name);

    }
}
