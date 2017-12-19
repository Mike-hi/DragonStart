import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private int con;
    
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
    }
    
    public void drawBackground(Graphics g){
        g.setColor(Color.red);
        for(int i = 0 ; i <= (x / 2) / 5; i++){
            g.drawRect(0 + (i * (con / 4)) , y, con / 4, con / 4);
        }
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
