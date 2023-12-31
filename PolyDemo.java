import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 * Class PolyDemo (is a JFrame) and PolyDemoPanel (is a JPanel). It is used to
 * draw descendant shapes of the Shape class.
 * 
 * Author: Rob Nash, 
 */

class PolyDemo extends JFrame {
    /**
     * Class constructor to set some things in windowing and JFrame
     */
    public PolyDemo() {
        getContentPane().add(new PolyDemoPanel());
        // just some windowing stuff that must happen
        // for all Frames
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This main method creates an object of PolyDemo
     * 
     * @param args
     */
    public static void main(String args[]) {
        PolyDemo myApp = new PolyDemo();
    }

    /**
     * This is our first "inner" or internal class the purpose of this class is
     * solely to support the JFrame class above, and I don't want it reused in
     * arbitrary contexts, so by nesting this class here I can indicate the intent a
     * bit more clearly that this class "goes with" the class above it. In general,
     * each class is a separate entity that should be contained in a separate file
     **/
    public class PolyDemoPanel extends JPanel {
        // Creates an array of type Shape
        Shape[] myShapes = new Shape[20];

        /**
         * Creates a class constructor that sets the value of the Shape array by calling
         * the getRandShape method
         */
        public PolyDemoPanel() {
            // Shape a = new Shape( getRandInt(), getRandInt());
            // Shape b = new Circle( getRandInt(), getRandInt(), getRandInt() );

            // a = new Square(getRandInt(), getRandInt(), getRandInt(), getRandInt() );

            // a = getRandShape();

            // ( (Circle) b ).getRadius();

            /***************************************
             * Code for populating our myShapes changes minimally when new classes are
             * introduced (only in getRandShape())
             *******************************************/

            for (int i = 0; i < 20; i++) {
                myShapes[i] = getRandShape();
               
            }
            

        }

        /*******************************************************
         * Code for drawing our shapes doesn't change at all! Since we intended to take
         * advantage of polymorphism, we coded this "in general" with respect to the
         * superclass, and not specific to any subclass.
         *****************************************************/
        /**
         * This paint method uses a parameter of Graphics type to paint and draw the
         * shapes in the shape array
         */
        public void paint(Graphics g) {
            super.paint(g); // don't remove - required for GUI widgets to draw correctly
            /************************
             * Late Binding Demo
             ************************/
            for (int i = 0; i < myShapes.length; i++) {
                // which draw method is invoked here?
                // There are many forms of the method (polymorphic),
                // so which is chosen?
                // Java has RTTI (run-time type info)
                // about every object,
                // and it uses this info to choose
                // the correct method to invoke!
                myShapes[i].draw(g);
            }
        }

        /**
         * This method returns a random int
         * 
         * @return int
         */
        public int getRandInt() {
            return ((int) (Math.random() * 200));
        }

        /**
         * This method returns a random double
         * 
         * @return double
         */
        public double getRandDouble() {
            return ((double) (Math.random() * 200));
        }

        /**
         * Below method calls various shape classes and assigns variable values to the
         * getRandInt() and getRandDouble() method values. It goes through the switch
         * statement to set the Shape object to an object of one of the Shape subclasses
         * that uses the local variables to set random values for their parameters.
         **/
        public Shape getRandShape() {
            Shape retVal = null;

            final int x = getRandInt();
            final int y = getRandInt();

            /********************************
             * Polymorphic extensibility demo
             *
             *******************************/

            switch ((int) (Math.random() * 6)) {
                case 0:
                    // draw the cirlce 
                    retVal =  new Circle(x, y, getRandInt());
                    break;
                case 1:
                    // case 1 for drawing rectangle
                    retVal = new Rectangle(25, 35);
                    break;
                case 2:
                    //  Draw a wheel for hair 
                    retVal = new SnowFlake(200, 40, 40, 40);

                    break;
                case 3:
                    // Drawing a face 
                    retVal = new Face( 200,200 ,200);
                    break;
                case 4:
                    // case 4 drawing "hair" for my smily face
                    retVal =  new Spray(220,200); 
                    break;
                case 5:
                    // Drawing a snowflake on the side this will be more of a snowflake shape not wheelshape
                    retVal = new SnowFlake(35, 55, 40, 5);
                    break;
                     
                    case 6:
                    // Draw more "Hair " thsi will make a wheel shape on top of the face 
                    retVal =retVal = new SnowFlake(290, 30, 30, 30);
                    break;
                   
            
                    
                        
            }
            
            

            return retVal  ;
        }
    }

    
   
}