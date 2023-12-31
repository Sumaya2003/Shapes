
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @version 1.0 Rectangle class represents a rectangle and inherits and extends
 *          Shape class and its methods. It also stores and draws Rectangles.
 */
public class Rectangle extends Shape {

    /**
     * This constructor needs x and y as formal parameters. In the Shape class, the x and y formal * parameters are used to set the super constructor.
     */
    public Rectangle(int x, int y) {
        super(x, y);
    }

    /**
    overrides the Shape class getArea method this is done by using the getters and mutiple the side and length for rectange to get the area 
     */
    public double getArea() {
        return getX() * getY();
    }
/**
    the draw method for the Shape class. It starts by making an object of the Graphics2D type and setting local variables
    x and y to the accessor method.
    
    We are going to override the draw method as well as make the color blue
    When drawing the rectangle instead of putting our local variables of this method in our drawRect() We are goign to put my personal input so it
    can print were i want it exactly 
     */
    public void draw(Graphics g) {
        Graphics2D find = (Graphics2D) g;
        final int get = getX();
        final int getY= getY();
        find.setColor(Color.BLUE);
        find.drawRect(260, 80, 80, 80);
    }

}