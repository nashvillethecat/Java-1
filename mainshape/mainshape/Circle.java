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
public class Circle extends Shape{

    int radius;
    double area;
    double permimeter;

    public Circle() {
        radius = 1;
    }

    public Circle(int radius) {
        this();
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return this.getRadius() * this.getRadius() * Math.PI;
    }

    @Override
    public double getPerimeter() {  //why can I have another one in the standard?
        return 2* Math.PI * this.getRadius();
    }

    public static double calcArea(Circle c) {
        return c.getRadius() * c.getRadius() * Math.PI;
                
    }

    public static double calcPerimeter(Circle c) {
        return 2 * Math.PI * c.getRadius();
    }
    
    
    
    //**********Standard Getters and Setters start here

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    //public double getArea() {
    //    return area;
    //}

    public void setArea(double area) {
        this.area = area;
    }

    public double getPermimeter() {
        return permimeter;
    }

    public void setPermimeter(double permimeter) {
        this.permimeter = permimeter;
    }
    
}//end class


