import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;
    private int[] x1 = new int[3];
    private int[] y1 = new int[3];
    private int con;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 250;
        y = 250;
        size = 1;
    }
    
    /**
     * Overloaded Constructors go here
     */
    public Dragon(Graphics g, int x1, int y1, int s, Color c){
        x = x1;
        y = y1;
        size = s;
        con = size * 10;
        g.setColor(c);
    }

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c);
        g.fillRect(x, y , size * 10, size * 10);
        g.fillRect(x + (size * 10), y + (size * 10), size * 20, size * 10);
        g.fillRect(x + (size * 10), y + (size * 20), size * 5, size * 10);
        g.fillRect(x + (size * 25), y + (size * 20), size * 5, size * 10);
        //graphics.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3); ex
        //g.fillPolygon(new int[] {170, 180, 170}, new int[] {150, 150 ,160}, 3); 1
        g.fillPolygon(new int[] {x + (2 * con), x + (3 * con), x + (2 * con)}, new int[] {y, y, y + (1 * con)}, 3);
        g.setColor(Color.black);
        //g.fillPolygon(new int[] {160, 155, 160}, new int[] {150, 150 ,140}, 3); 1
        g.fillPolygon(new int[] {x + con, x +(con / 2), x + con}, new int[] {y, y ,y - con}, 3);
        //g.fillPolygon(new int[] {160, 155, 155}, new int[] {150, 150 ,140}, 3); 1
        g.fillPolygon(new int[] {x + con, x +(con / 2), x + (con / 2)}, new int[] {y, y ,y - con}, 3);
        //g.fillPolygon(new int[] {, ,}, new int[] {, ,}, 3);
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size;
    }
}
