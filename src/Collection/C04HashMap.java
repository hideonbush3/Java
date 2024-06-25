package Collection;

import java.util.HashMap;
import java.util.Iterator;

public class C04HashMap {
    public static void main(String[] args) {
        // 선언
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // 요소 추가
        // key는 중복을 허용하지 않지만 value는 중복을 허용한다
        hm.put(10, "영철");
        hm.put(2, "영철");
        hm.put(5, "영철");
        hm.put(1, "광수");


        // keySet() - 해당 HashMap에 포함돼있는 key들을 담은 Set타입 객체를 반환
        // get() - 매개변수로 전달된 key에 해당하는 value를 반환
        for(Integer i : hm.keySet()){
            System.out.println("키: " + i + ", 값: " + hm.get(i));
        }

        System.out.println();

        // 10(key)이 이미 존재하기 때문에
        // 10의 기존 value(영철)에 "옥순"을 저장하고
        // 삭제된 "영철"을 반환한다
        System.out.println(hm.put(10, "옥순")); // 영철


        System.out.println();

        // iterator()
        Iterator<Integer> iterator = hm.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("키: " + key + ", 값: " + hm.get(key));
        }
        
        // 요소 변경
        hm.replace(1, "옥순");
        System.out.println(hm.get(1));  // 옥순

        // 요소 삭제
        hm.remove(1);

        // 요소 총 개수
        System.out.println(hm.size());

        // 특정 key 포함 여부
        System.out.println(hm.containsKey(1));  // false
        System.out.println(hm.containsKey(2));  // true
        
        // 특정 value 포함 여부
        System.out.println(hm.containsValue("광수"));   // false
        System.out.println(hm.containsValue("옥순"));   // true
    }
}
