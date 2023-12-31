import java.awt.Graphics;

public class SnowFlake extends Shape {
    private final int intervals; 
    private final int branches;// How many brances we wantg 

    public SnowFlake(int first, int second, int intervals, int branches) {
        super(first, second);
        this.intervals = intervals;
        this.branches = branches;
    }
 // Overides the draw in the shape class and here we will take the 
 //  object of Graphics2D type and sets local variables x and y by setting it with the getters as well as how mnay intervals we want of the snowflake to create
 // I want to be able to set me own getY() by entering 55 this will help with spacing when its drawn 
    @Override
    public void draw(Graphics g) {
        draw(g, getX(),55, intervals);
    }

    private void draw(Graphics g, int find, int Y, int size) {
       // Make sure we are able to define how many  branches we want 
        if (size >= 10) { // base case is depth we want to run for 10 greater 
            for (int i = 0; i < branches; i++) {
                int BRANCHES = find + (int) (size * Math.cos((2* Math.PI / branches) * i)); // Draw a branch use math class to make as percice as possible 
                int y = Y - (int) (size * Math.sin((2 * Math.PI / branches) * i)); 
                
                g.drawLine(find, Y, BRANCHES, y); // do a branch
                draw(g, BRANCHES, y, size / 3); // This is a recuccistion call so we can keep printing this method till we print the shape we want 
            }
        }
    }
}


