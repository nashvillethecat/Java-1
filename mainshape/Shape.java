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
public abstract class Shape {
    //I think most variable should only be in the non-abstract classes, right?
    //so these really shouldn't be here
//    int length;
//    int width;
//    int radius; 
//    double area;
//    double permimeter;
    
    private Point origin;  //why is this private?
    
    abstract public double getArea();
    abstract public double getPerimeter();

    public Shape() { //default constructor
        this.origin = new Point();
    }//end constructor
    
    public Shape(Point origin) {
        this.origin = origin;
    }//end constructor
    
    public void sayHello() {
        System.out.println("Hello! I am an unidentified blob.");
    }
    
    //********* Standard Getters and Setters

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    
    
} //end shape class
