import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
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
    private int con;
    private String n;
    private int heal;
    private String speak;
    private int numDrag;

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
    public Dragon(Graphics g, int x1, int y1, int s, Color c, String name, double health, String say){
        x = x1;
        y = y1;
        size = s;
        con = size * 10;
        n = name;
        speak = say;
        heal = (int)((health / 100) * ((double)(con * 5)));
        g.setColor(c);
        this.numDrag = numDrag;
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
        // anything with a 1 means that it works with size 1 only
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
        //g.fillPolygon(new int[] {150, 150, 155}, new int[] {155, 152 , 152}, 3); 1
        g.fillPolygon(new int[] {x, x, x + (con / 2)}, new int[] {y + (con / 2), y + (size * 2), y + (size * 2)}, 3);
        //drawOval(int x, int y, int width, int height)
        g.setColor(Color.red);
        g.fillOval(x + 1, y + (size * 2) + 1, (size * 2) - 1, (size * 2) - 1);
        g.setColor(Color.blue);
        g.fillRect(x , y + (con / 2) + size, (con / 2), (con / 3) - 1);
        nameDragon(g, n, con, x, y);
        health(g, con, x, y, size, heal);
    }
    public void drawDragon(Graphics g, int numDrag){
        numDrag = Math.abs(numDrag);
        for(int i = 0; i <= numDrag ; i++){
            
        }
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
    public static void nameDragon(Graphics g, String n, int con, int x, int y){
        g.setColor(Color.red);
        g.setFont(new Font("SERIF", Font.BOLD, 16));
        g.drawString(n , x + con, y - (con * 3));
    }
    public static void health(Graphics g, int con, int x, int y, int size, int heal){
        g.setColor(Color.RED);
        g.fillRect(x  - con , y - (con * 2) , heal, con / 3);
        g.setColor(Color.BLACK);
        g.drawRect(x  - con , y - (con * 2) , con * 5, con / 3);
    }
    public static void talk(){
        
    }
}
