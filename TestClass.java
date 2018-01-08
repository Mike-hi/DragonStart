import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.awt.FontMetrics;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(1000,1000);
       
       
       Graphics g = panel.getGraphics();
       Scanner scnr = new Scanner(System.in); 
       
       System.out.println("please enter a name for you're Dragon");
       String name = scnr.nextLine();
       System.out.println("x?");
       int x = scnr.nextInt();
       System.out.println("y?");
       int y = scnr.nextInt();
       System.out.println("size?");
       int size = scnr.nextInt();
       Color color = Color.RED;
       System.out.println("please type  in the percent of health you're dragon has");
       double health = scnr.nextDouble();
       String say = scnr.nextLine();
       System.out.println("How many dragons would you like? you may enter nothing if you only want one.");
       int numDrag = scnr.nextInt();
       ArrayList <Dragon> drag = new ArrayList <Dragon>();
       
       
       Dragon jen = new Dragon(g ,x, y, size, name, health, say);
       Background wall = new Background(g, x, y, size);
       SubTest s = new SubTest(g ,x, y, size, name, health, say);
        /*
        for(int i = 0 ; i < numDrag ; i++){
            drag.get(i ).drawDragon(g);
        }
        */
       
       numDrag = Math.abs(numDrag);
        for(int i = 0 ; i < numDrag ; i++){
            jen = new Dragon(g ,x + (((size * 20) * i) * 3), y, size, name, health, say);
            drag.add(jen);
            drag.get(i).drawDragon(g);
        }
        
       wall.drawBackground(g);
       jen.drawDragon(g);
       
       s.nameDragon(g, "hello name", size * 10, x + 100, y);
       System.out.println(jen);
    }
}
