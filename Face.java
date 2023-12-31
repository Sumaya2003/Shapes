import java.awt.Graphics;
import java.awt.Color;
class Face extends Shape{
  
    private int size;
// Con structor for face they are going to be preset in the driver 
 //parameters are used to set the super constructor in the Shape class.   
//These constructor's formal inputs are A and B the super constructor of the Shape class is configured using the a and b 
// We are alos goign to inialize our size instance variable 
public Face(int a, int b, int size) {

        super(a, b);

        this.size = size;

    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.BLACK); // The oval the face to be the color black 

        g.drawOval(80, 70, 170, 170); // The measurement for the face circle we want to it be on the far left 
        g.setColor(Color.BLACK); // Set the iris as black  fill it in 
        g.fillOval(120, 120, 15, 15);// Draw the left eye of the face
        g.fillOval(170, 120, 15, 15); // Draw the right eye of the face 
       // This is what going to be drawing the smile face on the face 
       // I have pre set inside of using varaibles becauses it easier and I want the shape to not change and be at the same place 
        g.drawArc(130, 170, 50, 20, 200, 200);
    }
 //This method overrides the Shape class getArea method by getting the area of the face as well as mutilpying by 7 
    public double getArea(){ return size*size*7; }

}

