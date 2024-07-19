package com.ryan.classwork;

public class Rectangle implements InterfaceCalculation{
    private float length;
    private float width;

    public Rectangle(){}

    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }
    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    //methods of the interface...

    @Override
    public float getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public float getArea() {
        return (length*width);
    }

    public void showDetails(){
        System.out.println("Length is:" + getLength());
        System.out.println("Width is:" + getWidth());
        System.out.println("Perimeter is:" + getPerimeter());
        System.out.println("Area is:" + getArea());
    }
}
