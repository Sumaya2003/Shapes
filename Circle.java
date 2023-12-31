

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Graphics2D;



public class Circle extends Shape{
// how big is going to be the raduis 
int howBig;
//This constructor takes formal inputs x, y, and theRadius.. The instance variable radius matches theRadius.
public Circle(int a, int b, int howBig) {
// Ca
super(a, b);

this.howBig = howBig;

}
// method overrides the Shape class draw method and then it going to be object of Graphics2D type and sets local variables
// its gong to draw the cirle as well instead of putting my local varaible i will define were i want my oval to draw on my JPannel exactly 
public void draw(Graphics g) {

int x = super.getX();

int y = super.getY();
g.setColor(Color.GREEN);
g.drawOval(300, 50, 100,100 );
g.setColor(Color.BLUE);
}
//* This method overrides the Shape class getArea method I will do this by setting how to get the the of a area of a circle
// used math class to get very specific output 
public double getArea(){ return Math.PI*howBig*howBig; }

}

