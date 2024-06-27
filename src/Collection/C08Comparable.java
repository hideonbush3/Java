package Collection;

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

    }
}
