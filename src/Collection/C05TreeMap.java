package Collection;

import java.util.TreeMap;

public class C05TreeMap {
    public static void main(String[] args) {
        // 레드-블랙 트리를 방식의 이진 검색 트리를 사용한다
        // 키를 기준으로 순서를 보장한다

        // 선언
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        // 추가
        tm.put("영철", 1);
        tm.put("옥순", 2);
        tm.put("광수", 2);
        
        // 특정 key를 포함하는지
        System.out.println(tm.containsKey("영철")); // true

        // 특정 value를 포함하는지
        System.out.println(1);  // true


        // keySet() - 해당 TreeMap에 포함돼있는 모든 key를 집합(Set)으로 반환
        // get() - 특정 키에 해당하는 값을 반환
        for(String name : tm.keySet()){
            System.out.println("키: " + name + ", 값: " + tm.get(name));
        }
    }
}
