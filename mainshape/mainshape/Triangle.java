/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshape;

/**
 *
 * @author Lita Mann
 */
public class Triangle extends Shape{
    int side1;
    int base;  //(or side2) but easier to use word base for formulas
    int side3;
    int height;
    
    //contructors

    public Triangle() {
        side1 = 5;
        base = 6;
        side3 = 5;
        height = 4;
    }

    public Triangle(int base, int height) {
        this();
        this.base = base;
        this.height = height;
    }

    public Triangle(int side1, int base, int side3, int height) {
        this();
        this.side1 = side1;
        this.base = base;
        this.side3 = side3;
        this.height = height;
    }

    
     @Override
    public double getArea() {
        return this.getBase() * this.getHeight()/2;
    }
    //perimeter side1+base+side3, area=1/2base*height
    
    @Override
    public double getPerimeter() {
        return this.getSide1() + this.getBase() + this.getSide3();
    }

    public static int calcArea(Rectangle r) {
        return r.getWidth() * r.getLength();
    }

    public static int calcPerimeter(Rectangle r) {
        return (r.getWidth() * 2) + (r.getLength() * 2);
    }
    
    
    //***********Standard Getters and Setters **************

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getBase() {
        return base;
    }

    public void base(int base) {
        this.base = base;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    
}//end class Triangle
