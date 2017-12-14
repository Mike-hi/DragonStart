import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
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
       
       Dragon jen = new Dragon(g ,x, y, size, color, name, health);
       
       jen.drawDragon(g);
     
       System.out.println(jen);
    }
}
