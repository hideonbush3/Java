package Stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

// 최종연산
// 지연돼있던 중간연산은 최종연산시 모두 수행된다
// 스트림의 모든 요소를 하나씩 소모한다
// 최종연산 수행 후 해당 스트림은 모두 소모된다 -> 스트림 재사용 불가
public class S05Terminal {
    public static void main(String[] args) {
        // 1. 요소 출력
        // forEach
        Stream<String> stream1 = Stream.of("요", "소", "출", "력");
        stream1.forEach(s -> System.out.printf("%s ", s));

        System.out.println();

        // 2. 요소 소모
        // reduce()
        Stream<String> stream2 = Stream.of("one", "two", "three");
        Stream<String> stream3 = Stream.of("one", "two", "three");
        
        Optional<String> result1 = stream2.reduce((s1, s2) -> s1 + " - " + s2);
        String result2 = stream3.reduce("숫자잇기 시작 ", (s1, s2) -> s1 + " - " + s2);
        
        System.out.println(result1.get());
        System.out.println(result2);


        // 3. 요소 검색
        // findFirst(), findAny() 
        // 첫번째 요소를 반환한다
        // 병렬 스트림인 경우엔 findAny()를 사용해야 더 정확한 값을 얻을 수 있음
        Stream<Integer> stream4 = Stream.of(3, 5, 1, 2, 4);
        Stream<Integer> stream5 = Stream.of(3, 5, 1, 2, 4);
        Optional<Integer> result3 = stream4.sorted().findFirst();
        Optional<Integer> result4 = stream5.sorted().findAny();
        System.out.println(result3.get());
        System.out.println(result4.get());


        // 4. 요소 검사
        Stream<Integer> stream6 = Stream.of(3, 5, 1, 2, 4);
        Stream<Integer> stream7 = Stream.of(3, 5, 1, 2, 4);
        // 하나라도 4보다 큰가?
        stream6.anyMatch(n -> n > 4); // true
        // 모든 요소가 4보다 큰가?
        stream7.allMatch(n -> n > 4); // false


        // 5. 요소 통계
        Stream<Integer> stream8 = Stream.of(3, 5, 1, 2, 4);
        Stream<Integer> stream9 = Stream.of(3, 5, 1, 2, 4);
        Stream<Integer> stream10 = Stream.of(3, 5, 1, 2, 4);
        IntStream stream11 = IntStream.of(3, 5, 1, 2, 4);
        IntStream stream12 = IntStream.of(3, 5, 1, 2, 4);

        // count() - 요소의 총 개수
        long count = stream8.count();

        // max(), min() - 요소중 최대값, 요소중 최소값
        Optional<Integer> max1 = stream9.max(Comparator.naturalOrder());
        Optional<Integer> min1 = stream10.min(Comparator.naturalOrder());
        OptionalInt max2 = stream11.max();
        OptionalInt min2 = stream12.min();
        
        // sum() - 요소 총합
        IntStream stream13 = IntStream.of(3, 5, 1, 2, 4);
        int total = stream13.sum();

        // average() 요소 평균값
        // 평균값이라 반환타입이 OptionalDouble
        IntStream stream14 = IntStream.of(3, 5, 1, 2, 4);
        LongStream stream15 = LongStream.of(1, 2, 3, 4, 5);
        DoubleStream stream16 = DoubleStream.of(1, 2, 3, 4, 5);
        OptionalDouble avg1 = stream14.average();
        OptionalDouble avg2 = stream15.average();
        OptionalDouble avg3 = stream16.average();


        // 6. 요소 수집
        // collect() - 인자로 전달되는 Collectors에 구현돼있는 메서드를 통해
        // 요소들을 수집
        // 또한, Collector 인터페이스를 직접 구현해서
        // 요소 수집방식을 커스텀할 수 있다

        // toList() - 스트림을 리스트로 변환
        Stream<String> stream17 = Stream.of("거북이", "매", "기린", "오랑우탄");
        List<String> list = stream17.collect(Collectors.toList());
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // toSet()
        Stream<Integer> stream18 = Stream.of(1, 2, 2, 2, 1, 1, 2, 3, 4, 5, 5, 6, 6);
        Set<Integer> evenNumbers = stream18
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toSet());
        System.out.println(evenNumbers);

        // counting()
        // 요소의 총 개수
        Stream<String> stream19 = Stream.of("거북이", "매", "기린", "오랑우탄");
        long count1 = stream19.collect(Collectors.counting());
        
        // maxBy()
        // 최대값
        Stream<Integer> stream20 = Stream.of(3, 5, 1, 2, 4);
        Optional<Integer> max = stream20.collect(Collectors.maxBy(Comparator.naturalOrder()));

        // minBy()
        // 최소값
        Stream<Integer> stream21 = Stream.of(3, 5, 1, 2, 4);
        Optional<Integer> min = stream21.collect(Collectors.minBy(Comparator.naturalOrder()));

        // reducing()
        // 연산의 결과값으로 재연산
        Stream<Integer> stream22 = Stream.of(3, 5, 1, 2, 4);
        Optional<Integer> result = stream22
            .collect(Collectors.reducing((n1, n2) -> n1 + n2));


        Stream<String> stream23 = Stream.of("apple", "banana", "cherry");
        int totalLength = stream23
            .collect(
                Collectors.reducing(
                    0,
                    s -> s.length(),  // 각 문자열을 길이로 변환
                    (length1, length2) -> Integer.sum(length1, length2)     // 변환된 길이를 합산
                )
            );  
        // 메서드 참조 방식
        // int totalLength = stream23
        // .collect(
        //     Collectors.reducing(
        //         0,
        //         String::length,  // 각 문자열을 길이로 변환
        //         Integer::sum     // 변환한 길이를 합산
        //     )
        // );  

        // partitioningBy - 조건으로 그룹화
        // 문자열 길이가 짝수냐 홀수냐
        Stream<String> stream30 = Stream.of("거북이", "매", "기린", "오랑우탄");
        Map<Boolean, List<String>> partition = stream30
            .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
        List<String> oddWord = partition.get(false);
        List<String> evenWord = partition.get(true);
        
        for(String s : oddWord){
            System.out.printf("%s ", s);
        }
        System.out.println();
        for(String s : evenWord){
            System.out.printf("%s ", s);
        }
    }
}