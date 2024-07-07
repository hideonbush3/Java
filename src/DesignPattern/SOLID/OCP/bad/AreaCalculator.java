package DesignPattern.SOLID.OCP.bad;

import java.util.List;

public class AreaCalculator{
    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes){
        this.shapes = shapes;
    }

    // 도형 리스트에 포함된 모든 도형의 면적을 합하는 메서드
    // 원, 사각형이 아닌 다른 도형을 추가하려면
    // 이 클래스를 수정해야한다 -> 개방-폐쇄 원칙에 어긋남
    public double sum(){
        int sum = 0;

        for(Shape shape : shapes){
            if(shape.getClass().equals(shape)){
                sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            }
            else if(shape.getClass().equals(Rectangle.class)){
                sum += ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth();
            }
        }

        return sum;
    }

}