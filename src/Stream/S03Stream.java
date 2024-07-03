package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S03Stream {
    public static void main(String[] args) {
        // 스트림 생성법
        // 1. 컬렉션
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 6; i++){
            list.add(i);
        }
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::print);

        System.out.println();

        // 2. 배열
        // 객체배열
        Integer[] intArr1 = {1, 2, 3, 4};
        Stream<Integer> stream3 = Arrays.stream(intArr1);
        stream3.forEach(num -> System.out.printf("%d ", num));
        
        System.out.println();

        // 기본형배열
        int[] intArr2 = {1, 2, 3, 4};
        IntStream stream4 = Arrays.stream(intArr2);
        stream4.forEach(num -> System.out.printf("%d ", num));

        System.out.println();

        
        // 3. 가변매개변수
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4);
        // IntStream<Integer> stream5 = IntStream.of(1, 2, 3, 4);
        stream5.forEach(num -> System.out.printf("%d ", num));

        System.out.println();


        // 4. 지정된 범위의 연속된 정수
        IntStream stream6 = IntStream.range(1, 5);      // 1, 2, 3, 4
        IntStream stream7 = IntStream.rangeClosed(1, 5);// 1, 2, 3, 4, 5


        // 5. 특정 타입의 난수들
        IntStream stream8 = new Random().ints(5);
        // IntStream stream8 = new Random().ints().limit(5);
        stream8.forEach(num -> System.out.printf("%d ", num));


        System.out.println();


        // 6. 람다 표현식
        // 람다 표현식을 매개변수로 받아서 무한 스트림을 생성
        Stream<Integer> stream9 = Stream.iterate(0, x -> x + 1);
        
        Stream<Integer> stream10 = Stream.generate(() -> 1);


        // 7. 파일
        // String<String> stream = Files.lines(Path path);

        
        // 8. 빈 스트림 생성
        Stream<Object> stream = Stream.empty();
        System.out.println(stream.count());    


    }
}
