package Collection;

import java.util.Arrays;
import java.util.Comparator;

public class C09Comparator {
    public static void main(String[] args) {

        // 비교만을 위해 존재하는 익명객체 생성
        // ver1 나이 비교기
        Comparator<Person> ageComp = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                if(p1.age > p2.age){
                    return 1;
                }
                else if(p1.age == p2.age){
                    return 0;
                }
                return -1;
            }
        };

        // 키 비교기
        Comparator<Person> heightComp = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                if(p1.height > p2.height){
                    return 1;
                }
                else if(p1.height == p2.height){
                    return 0;
                }
                return -1;
            }
        };

        Person p1 = new Person(30, 170);
        Person p2 = new Person(25, 180);

        System.out.println(ageComp.compare(p1, p2));    // 1  -> p1이 연장자다
        System.out.println(heightComp.compare(p1, p2)); // -1 -> p1이 키는 더 작다

        Person[] arr = new Person[5];
        int[] ageArr = {80, 30, 20, 50, 40};
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Person(ageArr[i], 170);
        }

        Arrays.sort(arr, ageComp);

        for(Person p : arr){
            System.out.print(p);
        }
    }
}

class Person{
    int age;
    int height;

    Person(){}

    Person(int age, int height){
        this.age = age;
        this.height = height;
    }

    public String toString(){
        return this.age + " ";
    }
}
