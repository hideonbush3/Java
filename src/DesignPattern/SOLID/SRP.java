package DesignPattern.SOLID;

public class SRP {
// SRP (single responsibility principle)
// 단일 책임 원칙
// 하나의 클래스는 하나의 역할만 갖도록 설계해야한다
// 유지보수성, 모듈 전반에서 가시성 제어 제공
}


// SRP를 따르지 않는 경우
// 면적계산용 클래스가 단위변환까지 수행한다
class RectangleAreaCalculator {
    private static final double INCH_TERM = 0.0254d;

    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int area(){
        return width * height;
    }

    // 문제의 메서드
    public double metersToInches(int area){
        return area / INCH_TERM;
    }
}


// 위 metersToInches() 메서드를 
// 단위변환용 클래스로 옮긴다
class AreaConverter{
    private static final double INCH_TERM = 0.0254d;
    private static final double FEET_TERM = 0.3048d;

    public double metersToInches(int area){
        return area / INCH_TERM;
    }

    public double metersToFeet(int area){
        return area / FEET_TERM;
    }
}