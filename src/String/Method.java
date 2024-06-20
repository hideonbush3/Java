package String;

public class Method {
    public static void main(String[] args) {
        String str =  "String Method";
        
        // 해당 문자열이 매개변수의 문자열을 포함하는지
        System.out.println(str.contains("thod"));           // true
        System.out.println(str.contains("a"));              // false

        // 매개변수로 전달한 문자열이 몇번 인덱스에 있는지 인덱스값 반환
        // 해당하는 문자열이 없을경우 -1을 반환
        // 맨 앞에서부터 검사하기 때문에 중복되는 경우 맨 처음 나온 지점의 인덱스값 반환
        System.out.println(str.indexOf("r"));             // 2
        
        // 매개변수로 전달한 인덱스의 문자(char)를 반환
        System.out.println(str.charAt(2));              // r

        // 해당 문자열이 매개변수의 문자열로 시작하는지
        System.out.println(str.startsWith("St"));      // true
        System.out.println(str.startsWith(" Method")); // false

        // 문자열 중 특정 부분만 뽑아내기
        // substring(시작 인덱스, 마지막 인덱스 + 1)
        System.out.println(str.substring(0, 7));    // String

        // 문자열 합치기
        System.out.println(str.concat(" 1.0"));     // String Method 1.0

        // 문자열을 모두 대문자로 변환
        System.out.println(str.toUpperCase());      // STRING METHOD
        
        // 문자열을 모두 소문자로 변환
        System.out.println(str.toLowerCase());      // string method

        // 문자열을 char 타입 배열로 변환
        char[] charArr = str.toCharArray();     // {'S', 't', ..., 'o', 'd'}

        // 해당 문자열을 매개변수로 전달한 정규표현식으로 나눔
        // String 배열 반환
        String time = "12:30:59";
        String[] timeArr = time.split(":");   // {"12", "30", "59"}
    }
}
