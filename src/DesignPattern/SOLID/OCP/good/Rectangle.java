package DesignPattern.SOLID.OCP.good;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
