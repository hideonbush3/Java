package DesignPattern.SOLID.OCP.bad;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}