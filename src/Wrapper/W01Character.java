package Wrapper;

public class W01Character {
    public static void main(String[] args) {
        // character에 대해서
        char c = '0';
        System.out.println(c == 0);                                 // false
        System.out.println(Character.getNumericValue(c) == 0);      // true
        System.out.println(c == '0');                               // true



        // getNumericValue()
        // 해당 문자를 유니코드값으로 변환해서 반환
        int i1 = c;
        int i2 = Character.getNumericValue(c);
        System.out.println(i1 == i2);                               // false
        System.out.println(i1);                                     // 48


        // isDigit()
        // 숫자인지 판별
        System.out.println(Character.isDigit(c));                   // true        


        // isSpaceChar()
        // 빈 문자인지 판별
        char space = ' ';
        System.out.println(Character.isSpaceChar(space));              // true

        
        // isLowerCase()
        // 소문자인지 판별
        char c1 = 'A';
        System.out.println(Character.isLowerCase(c1));      // false


        // toLowerCase()
        // 대문자를 소문자로
        System.out.println(Character.toLowerCase(c1));      // a
    } 
}
