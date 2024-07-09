package DesignPattern.SOLID.ISP.bad;

// 해결법
// 1. Animal 인터페이스에 eating 메서드만 남기고
// FlyingAnimal과 GroundAnimal이라는 인터페이스를 만든다

// 2. 그리고 해당 인터페이스들이 Animal을 상속받도록 하고

// 3. flying 메서드는 FlyingAnimal로,
// running 메서드는 GroundAnimal로 옮긴다

public class Tiger implements Animal{
    @Override
    public void eating() {
    }

    // 호랑이 클래스가 쓸모없는
    // flying 메서드까지 구현했다
    @Override
    public void flying() {
    }

    @Override
    public void running() {
    }
    
}
