/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshape;

//@author Lita Mann
public class Rectangle extends Shape {

    int length;
    int width;
    double area;
    double permimeter;

    public Rectangle() {
        length = 1;
        width = 2;
    }

    public Rectangle(int length, int width) {
        this();
        this.length = length;
        this.width = width;
    }
    

    @Override
    public double getArea() {
        return this.getWidth() * this.getLength();
    }

    @Override
    public double getPerimeter() {
        return (this.getWidth() * 2) + (this.getLength() * 2);
    }

    public static int calcArea(Rectangle r) {
        return r.getWidth() * r.getLength();
    }

    public static int calcPerimeter(Rectangle r) {
        return (r.getWidth() * 2) + (r.getLength() * 2);
    }
    //************* Standards Getters and Setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getPermimeter() {
        return permimeter;
    }

    public void setPermimeter(double permimeter) {
        this.permimeter = permimeter;
    }

}//end class Rectangle
