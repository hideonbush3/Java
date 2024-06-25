package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class C02HashSet {
    
    public static void main(String[] args) {
        // 선언
        HashSet<String> hs1 = new HashSet<String>();

        // 추가
        // HashSet은 요소 중복을 허용하지 않는다
        // add() - 저장 성공여부에 따라 true(성공) 또는 false(실패) 반환
        hs1.add("영철");
        hs1.add("광수");
        hs1.add("옥순");
        
        System.out.println(hs1.add("옥순"));     // false, 중복저장 불가

        // 요소 총 개수
        // size()
        System.out.println(hs1.size());  // 3

        // 출력
        // 1. enhanced for
        for(String name : hs1){
            System.out.println(name);   // 광수 영철 옥순
        }

        // 2. Iterator 객체 생성
        // iterator()
        Iterator<String> iterator = hs1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 특정 객체를 포햠하는지
        // contains(Object o)
        System.out.println(hs1.contains("옥순"));   // true


        // hs1과 다르게 요소 저장순서를 바꿔도
        // 저장되는 순서는 같다
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("옥순");
        hs2.add("영철");
        hs2.add("광수");
        for(String name : hs2){
            System.out.println(name);   // 광수 영철 옥순
        }
        

        // 특정 객체 삭제
        // remove(Obejct o)
        hs1.remove("옥순");
        for(String name : hs1){
            System.out.println(name);   // 광수 영철
        }
    }
    
}
