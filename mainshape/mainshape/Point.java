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
public class Point {

    public int x;
    public int y;

    //Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this(); 
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

} //end class Point
