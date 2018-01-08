import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;
import java.lang.Math;
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Background{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private int con;
    private int l;
    
    /**
     * Constructor for objects of class Background
     */
    
    
    /** 
     * Accessor Methods
     */
    /**
     * drawBackground(Graphics g)
     * Starting of drawing, complete your Background....
     */
    public Background(Graphics g, int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        con = size * 10;
        l = Math.round(1000/28);
    }
    
    public void drawBackground(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, 1000, y + (con * size));
        g.setColor(Color.gray);
        g.fillRect(0, y + (con * size), 1000, 1000 - ( y + (con * size)));
        g.setColor(Color.white);
        g.fillOval(1000 - (con * size) / 4, 0 - (con * size) / 4, (con * size) / 2 ,  (con * size) / 2);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
