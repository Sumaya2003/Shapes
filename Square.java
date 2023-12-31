

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Graphics2D;

public class Square extends Shape {
// set the instance variables to prevent privacy leaks 
private int width; // The width of the rectangle 

private int height; // height of the rectange 
//* These constructor's formal inputs are x and y. The super constructor of the Shape class is configured using the x and y formal 
// Then we are alos going to add our instance varibale and set them in the constructor .
public Square(int x, int y, int width, int height) {

super(x,y);

this.width = width;

this.height = height;

}
// This accessor method access and return the width of the squre 
public int getWidth() {

return width;

}
 /// This mutator method sets the instance variable to the variable width we want 
public void setWidth(int width) {

this.width = width;

}
// This accessor method access and return the height to the squre 
public int getHeight() {

return height;

}
/// This mutator method sets the instance variable to the variable height  we want 
public void setHeight(int height) {

this.height = height;

}


//* This method overrides the getArea method of the Shape class by substituting the formula for the square root of the area being calculated.
// Use the fromala for the area width * height for  a Square
public double getArea() {

return width * height;

}

//This draw method overrides the Shape class draw method.
// Creates an object of  Graphics2D name G 
// We are then going to start ng the rectangle by calling our varibles to set the specifix dementions of our squre 
// We are going to make the color green 
public void draw(Graphics g) {

Graphics2D find = (Graphics2D) g;

g.setColor(Color.green);

find.drawRect(getX(), getY(), width, height);

}

}