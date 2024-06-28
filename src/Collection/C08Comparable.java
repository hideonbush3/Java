package Collection;

import java.util.Arrays;
import java.util.Iterator;

class Dog implements Comparable<Dog>{
    public String name;
    public int age;

    Dog(){}

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Dog anotherDog){
        if(this.age > anotherDog.age){
            return 1;
        }
        else if(this.age == anotherDog.age){
            return 0;
        }
        else return -1;
    }
}

public class C08Comparable {
    public static void main(String[] args) {
        Dog dog1 = new Dog("땡칠이", 10);
        Dog dog2 = new Dog("땡구", 5);

        System.out.println(dog1.compareTo(dog2));

        // Boolean을 제외한 래퍼클래스들은 기본적으로 Comparable를 구현하고 있다
        System.out.println(new Integer(10).compareTo(new Integer(5)));  // 1
        System.out.println(new Integer(10).compareTo(new Integer(10))); // 0
        System.out.println(new Integer(10).compareTo(new Integer(15))); // -1

        CustomInteger[] arr = new CustomInteger[10];
        for(int i = 0; i < 10; i++){
            arr[i] = new CustomInteger((int) (Math.random() * 100));
        }

        Arrays.sort(arr);

        for(CustomInteger ci : arr){
            System.out.print(ci);
        }

    }
}

class CustomInteger implements Comparable<CustomInteger>{
    int value;
    
    CustomInteger(int value){
        this.value = value;
    }

    @Override
    public int compareTo(CustomInteger another){
        if(this.value > another.value){
            return 1;
        }
        else if(this.value == another.value){
            return 0;
        }
        return -1;
    }

    public String toString(){
        return this.value + " ";
    }
}
